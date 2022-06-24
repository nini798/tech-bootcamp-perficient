$( document ).ready(function() {

	var allData;

	//gets team data, forms team cards with buttons
	$.get("http://localhost:8080/team", function(data, status) {
		console.log(data);
		allData = data;
		$.each(data, function(key, item) {
			document.getElementById("teamCardArea").innerHTML +=
				"<button class='teamCardButton' id =" +
				item.id +
				"><img class='teamImg' src=" +
				item.logo +
				"></img><h2 class='teamName'>" +
				item.name +
				"</h2></button>";
		})
		document.getElementById("teamCardArea").innerHTML +=
			"<button class='addTeamButton'><h2>+ Add Team</h2></button>";
		console.log("check");
	});
	
	//player card activation, from team card button, shows associated players
	$(teamCardArea).on("click", ".teamCardButton", function(){
		if (!$(this).hasClass('activated')) {
			$(".teamCardButton").each(function() {
				if($(this).hasClass('activated')) {
					$(this).removeClass('activated');
				}
			})
			$(this).addClass('activated');
			var id = $(this).attr("id");
			console.log(id);
			var obj = allData.find((item) => item.id == id);
			$("#playerTitle").text(obj.name + " Players");
			document.getElementById("playerCardArea").innerHTML = "";
			if (obj.players.length > 0) {
				$.each(obj.players, function(key, item) {
					document.getElementById("playerCardArea").innerHTML +=
						"<div class='playerCard' id =" +
						item.id +
						"><h3 class='playerName'>" +
						item.name +
						"</h3><h4 class='mains'>" +
						item.main +
						"</h4><h4 class='ranking'>Rank: " +
						item.ranking +
						"</h4></div>";
				})
			}
		}
	})
	
	//pulls up new team input form
	$(teamCardArea).on("click", ".addTeamButton", function(){
  		document.getElementById("backdrop").style.display = "block";
  		document.getElementById("postArea").style.display = "block";
	});
	
	//returns to normal page if cancelleing input
	$(cancelButton).click(function() {
		document.getElementById("backdrop").style.display = "none";
  		document.getElementById("postArea").style.display = "none";
	})
	
	//submits data to backend, creates new team entry
	$(newTeamForm).submit(function(event) {
		event.preventDefault();
		var name = $(newName).val();
		var initials = $(newInitials).val();
		var logo = $(newLogo).val();
		
		var newItem = {
			id: 0,
			name: name,
			initials: initials,
			logo: logo
		}
		
		$.ajax("http://localhost:8080/team", {
			data : JSON.stringify(newItem),
			contentType : 'application/json',
			type : "POST"
		})
		
		location.reload();
		$(newName).val("");
		$(newInitials).val("");
		$(newLogo).val("");
	})
	
});
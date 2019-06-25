let marsApiButtons = document.querySelectorAll("button[id*='marsApi']")

marsApiButtons.forEach( button => button.addEventListener('click', function () {
									const buttonId = this.id
									const roverId = buttonId.split('marsApi')[1]
									let apiData = document.getElementById('marsApiRoverData')
									apiData.value = roverId
									document.getElementById('frmRoverType').submit()
								  }))

let marsApiButtons = document.querySelectorAll("button[id*='marsApi']")

marsApiButtons.forEach( button => button.addEventListener('click', function () {
									const buttonId = this.id
									const roverId = buttonId.split('marsApi')[1]
									alert(roverId)
								  }))

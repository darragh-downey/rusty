<script>

    let side = 1;
    let roll_str = "";
    
    function roll() {
        console.log("Clicked roll");
        let rand = Math.floor(Math.random() * (6 - 1) + 1);
        side = rand;
        roll_str = "Wow you rolled a " + side + "!!";
        console.log("rolled ", rand);
    }
</script>

<div class="grid place-items-center h-screen">
    <img src="../static/dice_{side}.png" alt="dice" width="200dp" height="160dp"/>
    <p class="">{roll_str}</p>
    <button class="button" on:click="{roll}">
        Roll
    </button>
</div>


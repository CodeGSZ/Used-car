<template>
    <div class="father">
        <div class="box">
            <div class="content">
                <div class="card bg-dark text-white">
                    <img src="static/img/other/car1.png" class="card-img" alt="...">
                    <div class="card-img-overlay">
                        <h2 class="card-title" style="margin-top:50px">轿车服务</h2>
                        <!-- <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        <p class="card-text">Last updated 3 mins ago</p> -->
                        <button @click="Car" type="button" class="btn btn-dark" style="width:150px; margin-top:50px">了解更多</button>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="card bg-dark text-white">
                    <img src="static/img/other/car2.png" class="card-img" alt="...">
                    <div class="card-img-overlay">
                        <h2 class="card-title" style="margin-top:50px">SUV&MPV租车服务</h2>
                        <!-- <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        <p class="card-text">Last updated 3 mins ago</p> -->
                        <button @click="Suv" type="button" class="btn btn-dark" style="width:150px; margin-top:50px">了解更多</button>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="card bg-dark text-white">
                    <img src="static/img/other/car3.png" class="card-img" alt="...">
                    <div class="card-img-overlay">
                        <h2 class="card-title" style="margin-top:50px">跑车服务</h2>
                        <!-- <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        <p class="card-text">Last updated 3 mins ago</p> -->
                        <button @click="Run" type="button" class="btn btn-dark" style="width:150px; margin-top:50px">了解更多</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            
        }
    },
    methods: {
        Car () {
            this.$router.push("/car");
        },
        Suv () {
            this.$router.push("/suv");
        },
        Run () {
            this.$router.push("/run");
        }
    }
}
</script>

<style scoped>
.box {
    height: 845px;
    width:100%;
    display: flex;
    /* border: 1px solid red; */
    justify-content: space-around;
}
.content {
    height: 845px;
    width: 450px;
    /* border: 1px solid white; */
}
</style>
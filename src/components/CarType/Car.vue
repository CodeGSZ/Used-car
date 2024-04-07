<template>
    <!-- 导航栏组件 -->
    <navigation>
        <template v-slot:search>
            <!-- 搜索框 -->
            <div class="mt-4">
                <el-input v-model="searchContent" placeholder="Please input" class="input-with-select" style="width: 300px; margin-top:-40px;">
                    <template #append>
                        <el-button/><img src="static/img/other/search.png" style="height:20px; width:20px">
                    </template>
                </el-input>
            </div>
        </template>
    </navigation>
    <!-- 轮播图 -->
    <div>
        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                <img src="static/img/other/car1.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>First slide label</h5>
                    <p>Some representative placeholder content for the first slide.</p>
                </div>
                </div>
                <div class="carousel-item">
                <img src="static/img/other/car2.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Some representative placeholder content for the second slide.</p>
                </div>
                </div>
                <div class="carousel-item">
                <img src="static/img/other/car3.jpg" style="height:570px" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Some representative placeholder content for the third slide.</p>
                </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-target="#carouselExampleCaptions" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-target="#carouselExampleCaptions" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </button>
        </div>
    </div>
    <!-- 内容区域 -->
    <div style="background:#fff">
        <div class="content1">
            <div class="car">
                <img @click="SelDetail(1,'Car','MIRAI')" src="static/img/other/c1.png" alt="">
                <p>MIRAI</p>
            </div>
            <div class="car center">
                <img @click="SelDetail(2,'Car','2023款凯美瑞')" src="static/img/other/c2.png" alt="">
                <p>2023款凯美瑞</p>
            </div>
            <div class="car">
                <img @click="SelDetail(3,'Car','2023款凯美瑞运动款')" src="static/img/other/c3.png" alt="">
                <p>2023款凯美瑞运动款</p>
            </div>
        </div>
        <div class="content1" style="margin-top:20px">
            <div class="car">
                <img @click="SelDetail(4,'Car','2023款凯美瑞智能双擎')" src="static/img/other/c4.png" alt="">
                <p>2023款凯美瑞智能双擎</p>
            </div>
            <div class="car center">
                <img @click="SelDetail(5,'Car','凌尚')" src="static/img/other/c5.png" alt="">
                <p>凌尚</p>
            </div>
            <div class="car">
                <img @click="SelDetail(6,'Car','凌尚智能电混双擎')" src="static/img/other/c6.png" alt="">
                <p>凌尚智能电混双擎</p>
            </div>
        </div>
    </div>
    <foot></foot>
</template>

<script>
import Navigation from '../navigation/navigation.vue'
import Foot from '../footer/footer.vue'
export default {
    data() {
        return {
           searchContent:'', 
        }
    },
    components: {
        Navigation,
        Foot
    },
    methods: {
        SelDetail (id,car,value) {
            this.$router.push({name:"CarDetail",params:{id:id, type:car, name:value}})
        }
    }    
}
</script>

<style scoped>
.content1 {
    height: 100%;
    width: 100%;
    display: flex;
    justify-content: center;
    /* border: 1px solid red; */
}
.car {
    height: 200px;
    width: 350px;
    text-align: center;
    /* border: 1px solid black; */
}
.car img {
    height: 150px;
    width: 350px;
}
.center {
    margin-left: 30px;
    margin-right: 30px;
}
</style>
<template>
    <!-- 导航栏 -->
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
    <!-- 顶部 -->
    <div>
        <div class="card bg-dark text-white">
            <img src="static/img/other/Run1.jpg" class="card-img" alt="...">
            <div class="card-img-overlay">
                <h2 class="card-title" style="margin-top:50px">新一代奥迪 S5 Cabriolet</h2>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to 
                                    <br>additional content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <p class="card-text">动感与优雅的结合，让你的身影也化为风景。</p>
                <button @click="Car" type="button" class="btn btn-dark" style="width:150px; margin-top:50px">了解更多</button>
            </div>
        </div>
    </div>
    <!-- 内容区域 -->
    <div class="content">
        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M2</div>
            <div class="card-body">
                <h5 class="card-title">全新 双门轿跑 择日起租</h5>
                <div class="card">
                    <img @click="SelDetail(1,'JiaoPao','BMW M2')" src="static/img/other/r2.png" class="card-img-top" alt="...">
                </div>
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M 240</div>
            <div class="card-body">
                <h5 class="card-title">双门轿跑轿车</h5>
                <div class="card">
                    <img @click="SelDetail(2,'JiaoPao','BMW M 240')" src="static/img/other/r3.png" class="card-img-top" alt="...">
                </div>  
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M3</div>
            <div class="card-body">
                <h5 class="card-title">绿巨人</h5>
                <div class="card">
                    <img @click="SelDetail(3,'JiaoPao','BMW M3')" src="static/img/other/r4.png" class="card-img-top" alt="...">
                </div>     
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M4</div>
            <div class="card-body">
                <h5 class="card-title">暗夜绿 择日起租</h5>
                <div class="card">
                    <img @click="SelDetail(4,'JiaoPao','BMW M4')" src="static/img/other/r5.png" class="card-img-top" alt="...">
                </div>     
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW WWW</div>
            <div class="card-body">
                <h5 class="card-title">敞篷轿跑</h5>
                <div class="card">
                    <img @click="SelDetail(5,'JiaoPao','BMW WWW')" src="static/img/other/r6.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW BWM i4 M50</div>
            <div class="card-body">
                <h5 class="card-title">双肾超跑</h5>
                <div class="card">
                    <img @click="SelDetail(6,'JiaoPao','BMW BWM i4 M50')" src="static/img/other/r7.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BWM 大红</div>
            <div class="card-body">
                <h5 class="card-title">无极变速 百秒破1.0</h5>
                <div class="card">
                    <img @click="SelDetail(7,'JiaoPao','BWM 大红')" src="static/img/other/r8.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW 自尊</div>
            <div class="card-body">
                <h5 class="card-title">暗夜公主</h5>
                <div class="card">
                    <img @click="SelDetail(8,'JiaoPao','BMW 自尊')" src="static/img/other/r9.png" class="card-img-top" alt="...">
                </div>     
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M8 双门轿跑</div>
            <div class="card-body">
                <h5 class="card-title">经典 水蓝</h5>
                <div class="card">
                    <img @click="SelDetail(9,'JiaoPao','BMW M8 双门轿跑')" src="static/img/other/r10.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW M8 四门轿跑</div>
            <div class="card-body">
                <h5 class="card-title">百万豪车</h5>
                <div class="card">
                    <img @click="SelDetail(10,'JiaoPao','BMW M8 四门轿跑')" src="static/img/other/r11.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>

        <div class="card bg-light mb-3" style="max-width: 18rem;">
            <div class="card-header">BMW X3 M</div>
            <div class="card-body">
                <h5 class="card-title">SUV型轿跑</h5>
                <div class="card">
                    <img @click="SelDetail(11,'JiaoPao','BMW X3 M')" src="static/img/other/r12.png" class="card-img-top" alt="...">
                </div> 
            </div>
        </div>
    </div>
    <!-- 脚部 -->
    <foot></foot>
</template>

<script>
import Navigation from '../navigation/navigation.vue'
import Foot from '../footer/footer.vue'

export default {
    data() {
        return {
            
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
.content {
    height: 100%;
    width:100%;
    display: flex;
    background: #fff;
    /* border: 1px solid red; */
    flex-wrap: wrap;
    justify-content: space-evenly;
}
</style>
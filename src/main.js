import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// 导入Element组件
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import Ecahrts from '../public/static/js/echarts.min.js'

createApp(App).use(store).use(router).use(ElementPlus).use(Ecahrts).mount('#app')

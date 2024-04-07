import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Loging from '../views/Loging.vue'
import AddUser from '../views/AddUser.vue'
import Car from '../components/CarType/Car.vue'
import SUV from '../components/CarType/SUV.vue'
import RUN from '../components/CarType/Run.vue'
import Admin from '../views/admin.vue'
import Fail from '../components/admin/order/fail.vue'
import Ordered from '../components/admin/order/ordered.vue'
import Ordering from '../components/admin/order/ordering.vue'
import Bar from '../components/admin/table/bar.vue'
import Line from '../components/admin/table/line.vue'
import Pie from '../components/admin/table/pie.vue'
import CarDetail from '../views/CarDetail.vue'
import Personal from '../views/personal.vue'
import Shopping from '../views/shopping.vue'

const routes = [
  // 路由从定向
  {
    path: '/',
    redirect: '/home'
  },
  // 主页
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  // 登录
  {
    path: '/loging',
    name: 'Loging',
    component: Loging
  },
  //轿车出租页
  {
    path:'/car',
    name:'Car',
    component:Car
  }, 
  // SUV出租页面
  {
    path:'/suv',
    name:'SUV',
    component:SUV
  },
  // 轿跑页面
  {
    path:'/run',
    name: 'RUN',
    component: RUN
  },
  // 注册
  {
    path:'/adduser',
    name:'AddUser',
    component:AddUser
  },
  // 车辆详情页
  {
    path: '/carDetail:id:type:name',
    name: 'CarDetail',
    component:CarDetail,
  },
  //个人中心页面
  {
    path: '/personal',
    name: 'Personal',
    component: Personal,
  },
  //购物车页面
  {
    path: '/shopping',
    name: 'Shopping',
    component: Shopping
  },
  // 管理员
  {
    path:'/admin',
    name:'Admin',
    component: Admin,
    // 配置二级路由
    children: [
      // 柱状图模块
      {
        path:'bar',
        name: 'Bar',
        component: Bar
      },
      {
        path: 'line',
        name: 'Line',
        component: Line
      },
      {
        path: 'pie',
        name: 'Pie',
        component: Pie
      },
      // 订单模块
      {
        path: 'order',
        name: 'Ordered',
        component: Ordered,
      },
      {
        path: 'ordering',
        name: 'Ordering',
        component:Ordering
      },
      {
        path: 'fail',
        name: 'Fail',
        component: Fail
      }
    ]
  },
  // {
  //   path: '/about',
  //   name: 'About',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: function () {
  //     return import(/* webpackChunkName: "about" */ '../views/About.vue')
  //   }
  // }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

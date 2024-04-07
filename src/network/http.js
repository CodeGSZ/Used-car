import { request } from "./beasehttp";

// 注册用户的请求
export function addUser (name,password,tel,sex,birthday) {
    return request ({
        url: '/user/add',
        method: 'post',
        params: {
            name,
            password,
            tel,
            sex,
            birthday
        }
    })
}

// 用户登录的请求
export function userLogin (name,password) {
    return request ({
        url: '/user/login',
        method: 'post',
        params: {
            name,
            password,
        }
    })
}

// 轿车数据的请求
export function CarDetail (id) {
    return request ({
        url: '/user/cardetail',
        method: 'post',
        params: {
            id
        }
    })
}

// 修改账号密码的请求
export function updateNP (id,name,password) {
    return request ({
        url: '/user/updateNP',
        method: 'post',
        params: {
            id,
            name,
            password
        }
    })
}

// 添加地址的请求
export function addAddress (id,address) {
    return request ({
        url: '/user/updateAddress',
        method: 'post',
        params: {
            id,
            address
        }
    })
}

// 添加购物车的请求
export function addShopping (id,num) {
    return request ({
        url: '/user/addshoping',
        method: 'post',
        params: {
            id,
            num
        }
    })
}

// admin查看完成订单
export function adminOrdered () {
    return request ({
        url: '/admin/ordered',
        method: 'post',
    })
}

// admin查看失败订单
export function adminFail () {
    return request ({
        url: '/admin/fail',
        method: 'post',
    })
}

// admin查看正在生效订单
export function adminOdering () {
    return request ({
        url: '/admin/ordering',
        method: 'post',
    })
}
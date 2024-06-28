import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import fangyuanxinxi from '@/views/modules/fangyuanxinxi/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import wuzhu from '@/views/modules/wuzhu/list'
    import zuke from '@/views/modules/zuke/list'
    import yuyuekanfang from '@/views/modules/yuyuekanfang/list'
    import discussfangyuanxinxi from '@/views/modules/discussfangyuanxinxi/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import messages from '@/views/modules/messages/list'
    import wuzhuhuifu from '@/views/modules/wuzhuhuifu/list'
    import config from '@/views/modules/config/list'
    import zukepingjia from '@/views/modules/zukepingjia/list'
    import wuzhushensu from '@/views/modules/wuzhushensu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '房屋资讯',
        component: news
      }
      ,{
	path: '/fangyuanxinxi',
        name: '房源信息',
        component: fangyuanxinxi
      }
      ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
      ,{
	path: '/wuzhu',
        name: '屋主',
        component: wuzhu
      }
      ,{
	path: '/zuke',
        name: '租客',
        component: zuke
      }
      ,{
	path: '/yuyuekanfang',
        name: '预约看房',
        component: yuyuekanfang
      }
      ,{
	path: '/discussfangyuanxinxi',
        name: '房源信息评论',
        component: discussfangyuanxinxi
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/wuzhuhuifu',
        name: '屋主回复',
        component: wuzhuhuifu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zukepingjia',
        name: '租客评价',
        component: zukepingjia
      }
      ,{
	path: '/wuzhushensu',
        name: '屋主申诉',
        component: wuzhushensu
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

$wnd.com_esofthead_mycollab_widgetset_MyCollabMobileWidgetSet.runAsyncCallback21("function Qyc(){}\nfunction Syc(){}\nfunction Uyc(){}\nfunction jgd(){VYb.call(this)}\nfunction V_b(a,b){return UN(a.H.Lm(b),2)}\nfunction W_b(a){return a.e.q+'themes/'+a.P.b}\nfunction Uwd(){xYb.call(this);this.I=$5d;this.b=new FHd}\nfunction yKc(c,a){var b=c;a.notifyChildrenOfSizeChange=jLd(function(){b.Pk()})}\nfunction GKc(b){try{b!=null&&eval('{ var document = $doc; var window = $wnd; '+b+'}')}catch(a){}}\nfunction vKc(b){if(b&&b.iLayoutJS){try{b.iLayoutJS();return true}catch(a){return false}}else{return false}}\nfunction uKc(a,b){var c,d;for(c=CEd(YCd(a.g));c.b.nh();){d=UN(HEd(c),2);if($N(a.g.Lm(d))===$N(b)){return d}}return null}\nfunction zKc(a,b){var c,d;d=uKc(a,b);d!=null&&a.g.Om(d);c=UN(a.b.Lm(b),278);if(c){a.b.Om(b);return Yc(a,c)}else if(b){return Yc(a,b)}return false}\nfunction wKc(a){var b,c,d;d=(otb(),a.ac).getElementsByTagName('IMG');for(b=0;b<d.length;b++){c=d[b];mtb.Qg(c,gQd)}}\nfunction AKc(a,b){var c,d,e;if((iu(),b).hasAttribute(x0d)){e=ou(b,x0d);a.f.Nm(e,b);Vt(b,'')}else{d=(otb(),Bvb(b));for(c=0;c<d;c++){AKc(a,Avb(b,c))}}}\nfunction BKc(a,b,c){var d,e;if(!b){return}d=VN(a.f.Lm(c));if(!d&&a.e){throw new PAd('No location '+c+lUd)}e=UN(a.g.Lm(c),18);if(e==b){return}!!e&&zKc(a,e);a.e||(d=(otb(),a.ac));Oc(a,b,(otb(),d));a.g.Nm(c,b)}\nfunction CKc(a,b){var c,d,e;d=b.ad();e=UN(a.b.Lm(d),278);if(Y8b(b.Od())){if(!e){c=uKc(a,d);Yc(a,d);e=new c9b(b,a.c);Nc(a,e,VN(a.f.Lm(c)));a.b.Nm(d,e)}T8b(e.b)}else{if(e){c=uKc(a,d);Yc(a,e);Nc(a,d,VN(a.f.Lm(c)));a.b.Om(d)}}}\nfunction Myc(c){var d={setter:function(a,b){a.b=b},getter:function(a){return a.b}};c.ik(Xjb,W5d,d);var d={setter:function(a,b){a.d=b},getter:function(a){return a.d}};c.ik(Xjb,X5d,d);var d={setter:function(a,b){a.c=b},getter:function(a){return a.c}};c.ik(Xjb,Y5d,d)}\nfunction DKc(){var a;Zc.call(this);this.f=new FHd;this.g=new FHd;this.b=new FHd;this.j='';this.e=false;ib(this,(otb(),_v($doc)));a=this.ac.style;Yx(a,oSd,(dy(),uLd));a[iUd]=0+(PB(),LLd);a[BUd]=SMd;(r2b(),!q2b&&(q2b=new I2b),r2b(),q2b).b.i&&Yx(a,JLd,(RA(),iMd));Tt(this.ac,$5d);Eb(this.ac,g_d,true)}\nfunction igd(a){var b,c;if(a.b){return}c=(!a.G&&(a.G=ig(a)),UN(UN(UN(a.G,5),39),161)).d;b=(!a.G&&(a.G=ig(a)),UN(UN(UN(a.G,5),39),161)).c;if(c!=null){b=V_b(a.v,'layouts/'+c+'.html');b==null&&Vt(Y(UN(Qg(a),78)),'<em>Layout file layouts/'+c+'.html is missing. Components will be drawn for debug purposes.<\\/em>')}b!=null&&xKc(UN(Qg(a),78),b,W_b(a.v));a.b=true}\nfunction tKc(a,b){var c,d,e,f,g,i,j,k;b=ZBd(b,'_UID_',a.i+'__');a.j='';d=0;f=b.toLowerCase();i='';j=f.indexOf('<script',0);while(j>0){i+=cCd(b,d,j);j=f.indexOf('>',j);e=f.indexOf('<\\/script>',j);a.j+=cCd(b,j+1,e)+';';g=d=e+9;j=f.indexOf('<script',g)}i+=bCd(b,d);f=i.toLowerCase();k=f.indexOf('<body');if(k<0){i=i}else{k=f.indexOf('>',k)+1;c=f.indexOf('<\\/body>',k);c>k?(i=cCd(i,k,c)):(i=bCd(i,k))}return i}\nfunction xKc(a,b,c){var d;b=tKc(a,b);d=M7b(c+'/layouts/');b=ZBd(b,'<((?:img)|(?:IMG))\\\\s([^>]*)src=\"((?![a-z]+:)[^/][^\"]+)\"',Z5d+d+'$3\"');b=ZBd(b,'<((?:img)|(?:IMG))\\\\s([^>]*)src=[^\"]((?![a-z]+:)[^/][^ />]+)[ />]',Z5d+d+'$3\"');b=ZBd(b,'(<[^>]+style=\"[^\"]*url\\\\()((?![a-z]+:)[^/][^\"]+)(\\\\)[^>]*>)','$1 '+d+'$2 $3');Vt((otb(),a.ac),b);a.f.Ic();AKc(a,a.ac);wKc(a);a.d=wtb(a.ac);!a.d&&(a.d=a.ac);yKc(a,a.d);a.e=true}\nvar W5d='childLocations',X5d='templateName',Y5d='templateContents',Z5d='<$1 $2src=\"',$5d='v-customlayout';mpb(1323,1,FTd);_.Je=function Pyc(){bCc(this.c,Xjb,mjb);TBc(this.c,qXd,lgb);WBc(this.c,pbb,vXd,new Qyc);WBc(this.c,lgb,vXd,new Syc);WBc(this.c,Xjb,vXd,new Uyc);_Bc(this.c,lgb,BMd,new LBc(pbb));_Bc(this.c,lgb,rMd,new LBc(Xjb));Myc(this.c);ZBc(this.c,Xjb,W5d,new MBc(CYd,JN(hob,LXd,8,0,[new LBc(Wib),new LBc(Tlb)])));ZBc(this.c,Xjb,X5d,new LBc(Tlb));ZBc(this.c,Xjb,Y5d,new LBc(Tlb));Nkc((!Gkc&&(Gkc=new Tkc),Gkc),this.b.e)};mpb(603,1,b$d,Qyc);_.ck=function Ryc(a,b){return new DKc};mpb(520,1,b$d,Syc);_.ck=function Tyc(a,b){return new jgd};mpb(1069,1,b$d,Uyc);_.ck=function Vyc(a,b){return new Uwd};mpb(78,GLd,{2485:1,2222:1,659:1,2379:1,127:1,2236:1,2256:1,327:1,317:1,18:1,78:1,196:1},DKc);_.Hc=function EKc(a){throw new UCd};_.Ic=function FKc(){Ic(this);this.g.Ic();this.b.Ic()};_.Pk=function HKc(){};_.tc=function IKc(a){Rb(this,a);if((otb(),ivb(a))==gQd){o8b(this,true);hvb(a,true)}};_.uc=function JKc(){Sb(this);!!this.d&&(this.d.notifyChildrenOfSizeChange=null,undefined)};_.Jc=function KKc(a){return zKc(this,a)};_.kc=function LKc(a){Tt((otb(),this.ac),a);Eb(this.ac,g_d,true)};_.e=false;mpb(605,922,{413:1,7:1,664:1,75:1,271:1,67:1,1597:1,136:1,213:1,80:1,414:1,149:1,3:1},jgd);_.Od=function kgd(){return !this.G&&(this.G=ig(this)),UN(UN(UN(this.G,5),39),161)};_.Ad=function lgd(){return !this.G&&(this.G=ig(this)),UN(UN(UN(this.G,5),39),161)};_.Ji=function mgd(){return !this.G&&(this.G=ig(this)),UN(UN(UN(this.G,5),39),161)};_.ad=function ngd(){return UN(Qg(this),78)};_.Cd=function ogd(){UN(Qg(this),78).c=this.v;UN(Qg(this),78).i=this.A};_.Qi=function pgd(){vKc((UN(Qg(this),78),wtb(Y(UN(Qg(this),78)))))};_.ke=function qgd(b){var c,d,e,f,g,i;igd(this);for(d=Qh(this).Pc();d.nh();){c=UN(d.oh(),7);e=UN((!this.G&&(this.G=ig(this)),UN(UN(UN(this.G,5),39),161)).b.Lm(c),2);try{BKc(UN(Qg(this),78),c.ad(),e)}catch(a){a=jpb(a);if(!WN(a,250))throw ipb(a)}}for(g=b.b.Pc();g.nh();){f=UN(g.oh(),7);if(f.yd()==this){continue}i=f.ad();i.rc()&&zKc(UN(Qg(this),78),i)}};_.Ed=function rgd(a){Sg(this,a);igd(this);GKc(UN(Qg(this),78).j);UN(Qg(this),78).j=null};_.le=function sgd(a){CKc(UN(Qg(this),78),a)};_.ui=function tgd(a,b){};_.b=false;mpb(161,39,{5:1,385:1,39:1,161:1,3:1},Uwd);var Xjb=nAd('com.vaadin.shared.ui.customlayout.','CustomLayoutState',161),lgb=nAd('com.vaadin.client.ui.customlayout.',u$d,605),pbb=nAd(o1d,'VCustomLayout',78),C8=nAd(a2d,'ConnectorBundleLoaderImpl$21$1$1',603),D8=nAd(a2d,'ConnectorBundleLoaderImpl$21$1$2',520),E8=nAd(a2d,'ConnectorBundleLoaderImpl$21$1$3',1069);jLd(Yq)(21);\n//# sourceURL=com.esofthead.mycollab.widgetset.MyCollabMobileWidgetSet-21.js\n")

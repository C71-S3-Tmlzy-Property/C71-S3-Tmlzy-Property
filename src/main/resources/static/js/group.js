
function relation(relations,permission_sign,e){

    if(relations != 1){
        //console.log($(this));
        var id = $(this).attr('id');
      
        if(id == 'tree'){
            var baseURI = this.baseURI;
            if(baseURI.indexOf("fee_order/index") >= 0 ) { 
                var permissionclass = 'order'
            } else if(baseURI.indexOf("house_owner/index") >= 0){
                var permissionclass = 'view_household';
            }


            if(permissionclass!=undefined && permissionclass!=''){

                var kk = 0; //无权限
                if(permission_sign.length==0){
                    alert('您没有权限访问该页面')
                    if(e != ''){
                       e.preventDefault();
                    }
                    return false;
                }

                for(var i=0;i<permission_sign.length;i++){
                    //alert(permission_sign[i]+"|"+permissionclass);
                    if(permission_sign[i] == permissionclass){
                        kk = 1; //有权限
                        break;
                    }
                }

                if(kk == 0){
                    if(e != ''){
                       e.preventDefault();
                    }
                 
                    alert('您没有权限访问该页面');
                    return false;

                }
            }
        }else{
            var permissionclass = $(this).attr('permissionclass');

            if(permissionclass!=undefined && permissionclass!=''){

                var kk = 0; //无权限
                if(permission_sign.length==0){
                    alert('您没有权限访问该页面')
                    if(e != ''){
                       e.preventDefault();
                    }
                    return false;
                }

                for(var i=0;i<permission_sign.length;i++){
                    //alert(permission_sign[i]+"|"+permissionclass);
                    if(permission_sign[i] == permissionclass){
                        kk = 1; //有权限
                        break;
                    }
                }

                if(kk == 0){
                    if(e != ''){
                       e.preventDefault();
                    }
                    alert('您没有权限访问该页面');
                    return false;

                }
            }
        }

    }
    return true;
}


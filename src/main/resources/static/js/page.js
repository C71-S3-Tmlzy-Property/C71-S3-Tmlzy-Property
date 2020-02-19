
function page(total, page_size, page, last_page) {
    $('.lou-pagination').pagination({
                items: total, // Total number of items that will be used to calculate the pages.
                itemsOnPage:  page_size, // Number of items displayed on each page.
                prevText: '<',
                nextText: '>',
                currentPage: page,
                ellipsePageSet: false, // 点击...无效果
                selectOnClick: false,
                onPageClick: function (pageNumber, event) {
                    if (event) {
                        event.preventDefault();
                    }
                    
                    var url = window.location.href;
                    var oUrl = url.toString();
                    if(oUrl.search('page=') != -1 ){
                        var re=eval('/(page=)([^&]*)/gi');
                        var nUrl = oUrl.replace(re,'page='+pageNumber);
                        window.location.href = nUrl;
                    }else{
                        if( url.indexOf('?')>0 ){
                            url += '&';
                        }else{
                            url += '?';
                        }
                        window.location.href = url+'page='+pageNumber;
                    }
                }
    });
    
    
     // 点击非空白区域阻止冒泡隐藏弹层 和 隐藏相关
    $(document).on('click', '.first-page-btn', function (e) {
        $('.lou-pagination').pagination('selectPage', 1);
    });
    $(document).on('click', '.last-page-btn', function (e) {
        $('.lou-pagination').pagination('selectPage', last_page);
    });
}


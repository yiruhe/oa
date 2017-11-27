(function ($) {

    $.createEdit = function (target){

        var e = new wangEditor(target);

        //自定义菜单
        e.customConfig.menus = [
            'head',
            'bold',
            'italic',
            'underline'
        ];

        e.create();

        return e;
    }

})(jQuery);

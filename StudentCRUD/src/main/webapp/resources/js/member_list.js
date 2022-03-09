$('#myModal').on(
            'show.bs.modal',
            function(e) {
                $(this).find('.btn-ok').attr('href',
                        $(e.relatedTarget).data('href'));
                $('.debug-url').html(
                        'Delete URL: <strong>'
                                + $(this).find('.btn-ok').attr('href')
                                + '</strong>');
            });

$(".alert").delay(3000).addClass("in").fadeOut(2000);
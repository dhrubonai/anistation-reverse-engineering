.class public final Landroidx/appcompat/widget/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/SearchView;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/widget/d3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/d3;->b:Landroidx/appcompat/widget/SearchView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/d3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/d3;->b:Landroidx/appcompat/widget/SearchView;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    invoke-virtual {v1}, Landroidx/appcompat/widget/SearchView;->u()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :goto_0
    iget-object v0, v1, Landroidx/appcompat/widget/SearchView;->i0:Ll0/b;

    .line 14
    .line 15
    instance-of v1, v0, Landroidx/appcompat/widget/u3;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Ll0/b;->b(Landroid/database/Cursor;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

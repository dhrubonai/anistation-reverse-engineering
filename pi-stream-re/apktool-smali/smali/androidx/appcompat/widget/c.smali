.class public final Landroidx/appcompat/widget/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionBarContextView;Li/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/widget/c;->a:I

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/g4;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    iput-object p1, p0, Landroidx/appcompat/widget/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lj/a;

    iget-object v1, p1, Landroidx/appcompat/widget/g4;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Landroidx/appcompat/widget/g4;->h:Ljava/lang/CharSequence;

    invoke-direct {v0, v1, p1}, Lj/a;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object v0, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    check-cast v0, Li/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Li/b;->a()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    iget-object p1, p0, Landroidx/appcompat/widget/c;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Landroidx/appcompat/widget/g4;

    .line 18
    .line 19
    iget-object v1, p1, Landroidx/appcompat/widget/g4;->k:Landroid/view/Window$Callback;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-boolean p1, p1, Landroidx/appcompat/widget/g4;->l:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    check-cast v0, Lj/a;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-interface {v1, p1, v0}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

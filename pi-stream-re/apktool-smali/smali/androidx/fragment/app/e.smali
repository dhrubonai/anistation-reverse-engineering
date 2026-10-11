.class public final Landroidx/fragment/app/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/e;->b:Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/e;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    check-cast v1, Landroidx/fragment/app/q;

    .line 10
    .line 11
    iget-object v0, v1, Landroidx/fragment/app/q;->p0:Landroidx/fragment/app/n;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/fragment/app/q;->x0:Landroid/app/Dialog;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->onDismiss(Landroid/content/DialogInterface;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    check-cast v1, Landroidx/fragment/app/f;

    .line 20
    .line 21
    iget-object v0, v1, Landroidx/fragment/app/f;->b:Landroid/view/ViewGroup;

    .line 22
    .line 23
    iget-object v2, v1, Landroidx/fragment/app/f;->c:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Landroidx/fragment/app/f;->d:Landroidx/fragment/app/j;

    .line 29
    .line 30
    invoke-virtual {v0}, Lf/d0;->b()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_0
    check-cast v1, Landroidx/fragment/app/s0;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

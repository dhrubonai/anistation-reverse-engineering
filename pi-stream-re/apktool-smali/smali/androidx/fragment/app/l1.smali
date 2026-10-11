.class public final Landroidx/fragment/app/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/m1;

.field public final synthetic c:Landroidx/fragment/app/n1;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/n1;Landroidx/fragment/app/m1;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/fragment/app/l1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/l1;->c:Landroidx/fragment/app/n1;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/fragment/app/l1;->b:Landroidx/fragment/app/m1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/l1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/l1;->b:Landroidx/fragment/app/m1;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/l1;->c:Landroidx/fragment/app/n1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :pswitch_0
    iget-object v0, v2, Landroidx/fragment/app/n1;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v0, v1, Landroidx/fragment/app/m1;->a:I

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 24
    .line 25
    invoke-static {v0, v1}, La3/g;->b(ILandroid/view/View;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :goto_0
    iget-object v0, v2, Landroidx/fragment/app/n1;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v0, v2, Landroidx/fragment/app/n1;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

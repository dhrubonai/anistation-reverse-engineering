.class public final synthetic Landroidx/fragment/app/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/z;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/z;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/z;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    check-cast v1, Landroidx/fragment/app/b0;

    .line 10
    .line 11
    check-cast p1, Landroid/content/Intent;

    .line 12
    .line 13
    iget-object p1, v1, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/fragment/app/e0;->a()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    check-cast v1, Landroidx/fragment/app/b0;

    .line 20
    .line 21
    check-cast p1, Landroid/content/res/Configuration;

    .line 22
    .line 23
    iget-object p1, v1, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/fragment/app/e0;->a()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    check-cast v1, Landroidx/activity/r;

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/activity/r;->b()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

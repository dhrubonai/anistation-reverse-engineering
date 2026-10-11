.class public final synthetic Landroidx/fragment/app/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/s0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/s0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/i0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/i0;->b:Landroidx/fragment/app/s0;

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
    iget v0, p0, Landroidx/fragment/app/i0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/i0;->b:Landroidx/fragment/app/s0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    check-cast p1, Lw/o;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p1, Lw/o;->a:Z

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->m(Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/16 v0, 0x50

    .line 30
    .line 31
    if-ne p1, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->l()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_2
    check-cast p1, Landroid/content/res/Configuration;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->h(Landroid/content/res/Configuration;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_0
    check-cast p1, Lw/x;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-boolean p1, p1, Lw/x;->a:Z

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->r(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public Landroidx/fragment/app/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/d0;
.implements Lc0/c;
.implements Lb2/v;
.implements Lb2/g0;
.implements Lp6/g;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Lh0/k;

    invoke-direct {v0, p0}, Lh0/k;-><init>(Landroidx/fragment/app/o;)V

    iput-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lh0/j;

    invoke-direct {v0, p0}, Lh0/j;-><init>(Landroidx/fragment/app/o;)V

    iput-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lw/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/WindowManager;

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lw/f;->h(Landroid/view/Display;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb2/l;

    .line 4
    .line 5
    iget-object v1, v0, Lb2/l;->g1:Landroid/view/Surface;

    .line 6
    .line 7
    invoke-static {v1}, Lw7/b;->w(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lb2/l;->g1:Landroid/view/Surface;

    .line 11
    .line 12
    iget-object v3, v0, Lb2/l;->Y0:Lb2/e0;

    .line 13
    .line 14
    iget-object v1, v3, Lb2/e0;->a:Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    new-instance v8, Lb2/c0;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    move-object v2, v8

    .line 26
    invoke-direct/range {v2 .. v7}, Lb2/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 v1, 0x1

    .line 33
    iput-boolean v1, v0, Lb2/l;->j1:Z

    .line 34
    .line 35
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb2/l;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Lb2/l;->K0(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroidx/lifecycle/u;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroidx/fragment/app/q;

    .line 8
    .line 9
    iget-boolean v0, p1, Landroidx/fragment/app/q;->t0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/y;->P()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p1, Landroidx/fragment/app/q;->x0:Landroid/app/Dialog;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-static {v1}, Landroidx/fragment/app/s0;->H(I)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "DialogFragment "

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, " setting the content view on "

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v2, p1, Landroidx/fragment/app/q;->x0:Landroid/app/Dialog;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "FragmentManager"

    .line 59
    .line 60
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/q;->x0:Landroid/app/Dialog;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "DialogFragment can not be attached to a container view"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_2
    :goto_0
    return-void
.end method

.method public g(I)Lh0/h;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(I)Lh0/h;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/m1;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/m1;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

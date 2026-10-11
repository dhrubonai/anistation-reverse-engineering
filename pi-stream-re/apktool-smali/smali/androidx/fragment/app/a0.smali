.class public final Landroidx/fragment/app/a0;
.super Lcom/bumptech/glide/c;
.source "SourceFile"

# interfaces
.implements Lx/n;
.implements Lx/o;
.implements Lw/v;
.implements Lw/w;
.implements Landroidx/lifecycle/c1;
.implements Landroidx/activity/s;
.implements Lc/i;
.implements Ln3/g;
.implements Landroidx/fragment/app/x0;
.implements Lg0/n;


# instance fields
.field public final C:Landroid/app/Activity;

.field public final D:Landroid/content/Context;

.field public final E:Landroid/os/Handler;

.field public final F:Landroidx/fragment/app/t0;

.field public final synthetic G:Landroidx/fragment/app/b0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    new-instance v0, Landroid/os/Handler;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/bumptech/glide/c;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/fragment/app/t0;

    .line 12
    .line 13
    invoke-direct {v1}, Landroidx/fragment/app/t0;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/fragment/app/a0;->C:Landroid/app/Activity;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final P(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final Q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public final a(Landroidx/fragment/app/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/b0;->onAttachFragment(Landroidx/fragment/app/y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/p;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 4
    .line 5
    return-object v0
.end method

.method public final getSavedStateRegistry()Ln3/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getSavedStateRegistry()Ln3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/b1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getViewModelStore()Landroidx/lifecycle/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final o0(Lg0/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addMenuProvider(Lg0/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnConfigurationChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnMultiWindowModeChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnPictureInPictureModeChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->addOnTrimMemoryListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t0()Landroidx/activity/r;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/j;->getOnBackPressedDispatcher()Landroidx/activity/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final u0(Lg0/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeMenuProvider(Lg0/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnConfigurationChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnMultiWindowModeChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final x0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnPictureInPictureModeChangedListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final y0(Lf0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/j;->removeOnTrimMemoryListener(Lf0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.class public abstract Landroidx/fragment/app/b0;
.super Landroidx/activity/j;
.source "SourceFile"

# interfaces
.implements Lw/d;
.implements Lw/e;


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

.field final mFragments:Landroidx/fragment/app/e0;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/activity/j;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/a0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/fragment/app/a0;-><init>(Landroidx/fragment/app/b0;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/fragment/app/e0;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/fragment/app/e0;-><init>(Landroidx/fragment/app/a0;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 15
    .line 16
    new-instance v0, Landroidx/lifecycle/w;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Landroidx/lifecycle/w;-><init>(Landroidx/lifecycle/u;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Landroidx/fragment/app/b0;->mStopped:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/activity/j;->getSavedStateRegistry()Ln3/e;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Landroidx/activity/c;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0}, Landroidx/activity/c;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    const-string v3, "android:support:lifecycle"

    .line 36
    .line 37
    invoke-virtual {v1, v3, v2}, Ln3/e;->c(Ljava/lang/String;Ln3/d;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Landroidx/fragment/app/z;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/z;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroidx/activity/j;->addOnConfigurationChangedListener(Lf0/a;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Landroidx/fragment/app/z;

    .line 50
    .line 51
    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/z;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1}, Landroidx/activity/j;->addOnNewIntentListener(Lf0/a;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Landroidx/activity/d;

    .line 58
    .line 59
    invoke-direct {v1, p0, v0}, Landroidx/activity/d;-><init>(Landroidx/fragment/app/b0;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroidx/activity/j;->addOnContextAvailableListener(Lb/b;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static h(Landroidx/fragment/app/b0;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p0, p0, v1}, Landroidx/fragment/app/s0;->b(Landroidx/fragment/app/a0;Lcom/bumptech/glide/c;Landroidx/fragment/app/y;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic i(Landroidx/fragment/app/b0;)Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/b0;->markFragmentsCreated()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static j(Landroidx/fragment/app/s0;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {p0}, Li/g;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_7

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/fragment/app/y;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v3, v2, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object v3, v3, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 35
    .line 36
    :goto_1
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/fragment/app/y;->j()Landroidx/fragment/app/s0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Landroidx/fragment/app/b0;->j(Landroidx/fragment/app/s0;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    or-int/2addr v1, v3

    .line 47
    :cond_3
    iget-object v3, v2, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 48
    .line 49
    sget-object v4, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/o;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    invoke-virtual {v3}, Landroidx/fragment/app/j1;->b()V

    .line 55
    .line 56
    .line 57
    iget-object v3, v3, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 58
    .line 59
    iget-object v3, v3, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ltz v3, :cond_4

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move v3, v0

    .line 70
    :goto_2
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object v1, v2, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 73
    .line 74
    iget-object v1, v1, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroidx/lifecycle/w;->g()V

    .line 77
    .line 78
    .line 79
    move v1, v5

    .line 80
    :cond_5
    iget-object v3, v2, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 81
    .line 82
    iget-object v3, v3, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ltz v3, :cond_6

    .line 89
    .line 90
    move v3, v5

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    move v3, v0

    .line 93
    :goto_3
    if-eqz v3, :cond_0

    .line 94
    .line 95
    iget-object v1, v2, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/lifecycle/w;->g()V

    .line 98
    .line 99
    .line 100
    move v1, v5

    .line 101
    goto :goto_0

    .line 102
    :cond_7
    return v1
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/fragment/app/s0;->f:Landroidx/fragment/app/g0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/g0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Lw/n;->shouldDumpInternalState([Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Local FragmentActivity "

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, " State:"

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "  "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "mCreated="

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v1, p0, Landroidx/fragment/app/b0;->mCreated:Z

    .line 61
    .line 62
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 63
    .line 64
    .line 65
    const-string v1, " mResumed="

    .line 66
    .line 67
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Landroidx/fragment/app/b0;->mResumed:Z

    .line 71
    .line 72
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 73
    .line 74
    .line 75
    const-string v1, " mStopped="

    .line 76
    .line 77
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Landroidx/fragment/app/b0;->mStopped:Z

    .line 81
    .line 82
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-static {p0}, Lz0/a;->a(Landroidx/lifecycle/u;)Lz0/d;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v0, p3}, Lz0/d;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 99
    .line 100
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 101
    .line 102
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 103
    .line 104
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/s0;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public getSupportFragmentManager()Landroidx/fragment/app/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 6
    .line 7
    return-object v0
.end method

.method public getSupportLoaderManager()Lz0/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lz0/a;->a(Landroidx/lifecycle/u;)Lz0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/b0;->getSupportFragmentManager()Landroidx/fragment/app/s0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/fragment/app/b0;->j(Landroidx/fragment/app/s0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/j;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/y;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/j;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p1, Landroidx/fragment/app/s0;->E:Z

    .line 19
    .line 20
    iput-boolean v0, p1, Landroidx/fragment/app/s0;->F:Z

    .line 21
    .line 22
    iget-object v1, p1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 23
    .line 24
    iput-boolean v0, v1, Landroidx/fragment/app/w0;->f:Z

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/b0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/b0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->k()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/j;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/s0;->i()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/b0;->mResumed:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/s0;->t(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 18
    .line 19
    sget-object v1, Landroidx/lifecycle/n;->ON_PAUSE:Landroidx/lifecycle/n;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onPostResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/b0;->onResumeFragments()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/j;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/b0;->mResumed:Z

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/n;->ON_RESUME:Landroidx/lifecycle/n;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Landroidx/fragment/app/s0;->E:Z

    .line 16
    .line 17
    iput-boolean v1, v0, Landroidx/fragment/app/s0;->F:Z

    .line 18
    .line 19
    iget-object v2, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 20
    .line 21
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->f:Z

    .line 22
    .line 23
    const/4 v1, 0x7

    .line 24
    invoke-virtual {v0, v1}, Landroidx/fragment/app/s0;->t(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/b0;->mStopped:Z

    .line 11
    .line 12
    iget-boolean v1, p0, Landroidx/fragment/app/b0;->mCreated:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iput-boolean v2, p0, Landroidx/fragment/app/b0;->mCreated:Z

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 24
    .line 25
    iput-boolean v0, v1, Landroidx/fragment/app/s0;->E:Z

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/s0;->F:Z

    .line 28
    .line 29
    iget-object v3, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 30
    .line 31
    iput-boolean v0, v3, Landroidx/fragment/app/w0;->f:Z

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-virtual {v1, v3}, Landroidx/fragment/app/s0;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 40
    .line 41
    iget-object v1, v1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/n;->ON_START:Landroidx/lifecycle/n;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 54
    .line 55
    iget-object v1, v1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 58
    .line 59
    iput-boolean v0, v1, Landroidx/fragment/app/s0;->E:Z

    .line 60
    .line 61
    iput-boolean v0, v1, Landroidx/fragment/app/s0;->F:Z

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 64
    .line 65
    iput-boolean v0, v2, Landroidx/fragment/app/w0;->f:Z

    .line 66
    .line 67
    const/4 v0, 0x5

    .line 68
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e0;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/b0;->mStopped:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/b0;->markFragmentsCreated()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/b0;->mFragments:Landroidx/fragment/app/e0;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/fragment/app/e0;->a:Landroidx/fragment/app/a0;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/a0;->F:Landroidx/fragment/app/t0;

    .line 15
    .line 16
    iput-boolean v0, v1, Landroidx/fragment/app/s0;->F:Z

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 19
    .line 20
    iput-boolean v0, v2, Landroidx/fragment/app/w0;->f:Z

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Landroidx/fragment/app/b0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/w;

    .line 27
    .line 28
    sget-object v1, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setEnterSharedElementCallback(Lw/y;)V
    .locals 0

    .line 1
    sget p1, Lw/g;->a:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p0, p1}, Lw/b;->c(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setExitSharedElementCallback(Lw/y;)V
    .locals 0

    .line 1
    sget p1, Lw/g;->a:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p0, p1}, Lw/b;->d(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/y;Landroid/content/Intent;I)V
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/b0;->startActivityFromFragment(Landroidx/fragment/app/y;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/y;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 2
    sget p1, Lw/g;->a:I

    .line 3
    invoke-static {p0, p2, v0, p4}, Lw/a;->b(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Landroidx/fragment/app/y;->T(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/y;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 12
    .param p2    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    move-object v1, p2

    .line 3
    move v2, p3

    .line 4
    move-object/from16 v3, p4

    .line 5
    .line 6
    move-object/from16 v7, p8

    .line 7
    .line 8
    const/4 v4, -0x1

    .line 9
    if-ne v2, v4, :cond_0

    .line 10
    .line 11
    sget v0, Lw/g;->a:I

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p2

    .line 15
    move v2, p3

    .line 16
    move-object/from16 v3, p4

    .line 17
    .line 18
    move/from16 v4, p5

    .line 19
    .line 20
    move/from16 v5, p6

    .line 21
    .line 22
    move/from16 v6, p7

    .line 23
    .line 24
    move-object/from16 v7, p8

    .line 25
    .line 26
    invoke-static/range {v0 .. v7}, Lw/a;->c(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v5, v0, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 31
    .line 32
    const-string v6, "Fragment "

    .line 33
    .line 34
    if-eqz v5, :cond_8

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    invoke-static {v5}, Landroidx/fragment/app/s0;->H(I)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const-string v9, "FragmentManager"

    .line 42
    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    new-instance v8, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v10, " received the following in startIntentSenderForResult() requestCode: "

    .line 54
    .line 55
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v10, " IntentSender: "

    .line 62
    .line 63
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v10, " fillInIntent: "

    .line 70
    .line 71
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v10, " options: "

    .line 78
    .line 79
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v9, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/y;->m()Landroidx/fragment/app/s0;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iget-object v10, v8, Landroidx/fragment/app/s0;->A:Lc/e;

    .line 97
    .line 98
    if-eqz v10, :cond_6

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    if-nez v3, :cond_2

    .line 103
    .line 104
    new-instance v3, Landroid/content/Intent;

    .line 105
    .line 106
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v4, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 110
    .line 111
    const/4 v10, 0x1

    .line 112
    invoke-virtual {v3, v4, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-static {v5}, Landroidx/fragment/app/s0;->H(I)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    new-instance v4, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v10, "ActivityOptions "

    .line 124
    .line 125
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v10, " were added to fillInIntent "

    .line 132
    .line 133
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v10, " for fragment "

    .line 140
    .line 141
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    :cond_3
    const-string v4, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 155
    .line 156
    invoke-virtual {v3, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 157
    .line 158
    .line 159
    :cond_4
    new-instance v4, Lc/k;

    .line 160
    .line 161
    move/from16 v10, p5

    .line 162
    .line 163
    move/from16 v11, p6

    .line 164
    .line 165
    invoke-direct {v4, p2, v3, v10, v11}, Lc/k;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Landroidx/fragment/app/p0;

    .line 169
    .line 170
    iget-object v3, v0, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 171
    .line 172
    invoke-direct {v1, v3, p3}, Landroidx/fragment/app/p0;-><init>(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    iget-object v2, v8, Landroidx/fragment/app/s0;->C:Ljava/util/ArrayDeque;

    .line 176
    .line 177
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v5}, Landroidx/fragment/app/s0;->H(I)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, "is launching an IntentSender for result "

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    :cond_5
    iget-object v0, v8, Landroidx/fragment/app/s0;->A:Lc/e;

    .line 207
    .line 208
    invoke-virtual {v0, v4}, Lc/e;->a(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_6
    move/from16 v10, p5

    .line 213
    .line 214
    move/from16 v11, p6

    .line 215
    .line 216
    iget-object v0, v8, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 217
    .line 218
    if-ne v2, v4, :cond_7

    .line 219
    .line 220
    iget-object v0, v0, Landroidx/fragment/app/a0;->C:Landroid/app/Activity;

    .line 221
    .line 222
    sget v4, Lw/g;->a:I

    .line 223
    .line 224
    move-object v1, p2

    .line 225
    move v2, p3

    .line 226
    move-object/from16 v3, p4

    .line 227
    .line 228
    move/from16 v4, p5

    .line 229
    .line 230
    move/from16 v5, p6

    .line 231
    .line 232
    move/from16 v6, p7

    .line 233
    .line 234
    move-object/from16 v7, p8

    .line 235
    .line 236
    invoke-static/range {v0 .. v7}, Lw/a;->c(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 237
    .line 238
    .line 239
    :goto_0
    return-void

    .line 240
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    const-string v1, "Starting intent sender with a requestCode requires a FragmentActivity host"

    .line 246
    .line 247
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 252
    .line 253
    const-string v2, " not attached to Activity"

    .line 254
    .line 255
    invoke-static {v6, p1, v2}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v1
.end method

.method public supportFinishAfterTransition()V
    .locals 1

    .line 1
    sget v0, Lw/g;->a:I

    .line 2
    .line 3
    invoke-static {p0}, Lw/b;->a(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 1

    .line 1
    sget v0, Lw/g;->a:I

    .line 2
    .line 3
    invoke-static {p0}, Lw/b;->b(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 1

    .line 1
    sget v0, Lw/g;->a:I

    .line 2
    .line 3
    invoke-static {p0}, Lw/b;->e(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

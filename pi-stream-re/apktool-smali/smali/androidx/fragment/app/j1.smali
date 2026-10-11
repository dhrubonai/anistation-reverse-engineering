.class public final Landroidx/fragment/app/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/j;
.implements Ln3/g;
.implements Landroidx/lifecycle/c1;


# instance fields
.field public final a:Landroidx/fragment/app/y;

.field public final b:Landroidx/lifecycle/b1;

.field public c:Landroidx/lifecycle/y0;

.field public d:Landroidx/lifecycle/w;

.field public e:Ln3/f;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/y;Landroidx/lifecycle/b1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/fragment/app/j1;->e:Ln3/f;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/j1;->a:Landroidx/fragment/app/y;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/fragment/app/j1;->b:Landroidx/lifecycle/b1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/w;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/w;-><init>(Landroidx/lifecycle/u;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 11
    .line 12
    new-instance v0, Ln3/f;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ln3/f;-><init>(Ln3/g;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/j1;->e:Ln3/f;

    .line 18
    .line 19
    invoke-virtual {v0}, Ln3/f;->a()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/bumptech/glide/d;->r(Ln3/g;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Ly0/c;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j1;->a:Landroidx/fragment/app/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Ly0/d;

    .line 31
    .line 32
    invoke-direct {v2}, Ly0/d;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v2, Ly0/c;->a:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v4, Landroidx/lifecycle/q0;->a:Landroidx/lifecycle/q0;

    .line 40
    .line 41
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    sget-object v1, Lcom/bumptech/glide/d;->a:Landroidx/lifecycle/q0;

    .line 45
    .line 46
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object v1, Lcom/bumptech/glide/d;->b:Landroidx/lifecycle/q0;

    .line 50
    .line 51
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Landroidx/fragment/app/y;->f:Landroid/os/Bundle;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v1, Lcom/bumptech/glide/d;->c:Landroidx/lifecycle/q0;

    .line 59
    .line 60
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_3
    return-object v2
.end method

.method public final getDefaultViewModelProviderFactory()Landroidx/lifecycle/y0;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j1;->a:Landroidx/fragment/app/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/y0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Landroidx/fragment/app/y;->g0:Landroidx/lifecycle/u0;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Landroidx/fragment/app/j1;->c:Landroidx/lifecycle/y0;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/j1;->c:Landroidx/lifecycle/y0;

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    instance-of v2, v1, Landroid/app/Application;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v1, Landroid/app/Application;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_1
    new-instance v2, Landroidx/lifecycle/u0;

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/fragment/app/y;->f:Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {v2, v1, p0, v0}, Landroidx/lifecycle/u0;-><init>(Landroid/app/Application;Ln3/g;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Landroidx/fragment/app/j1;->c:Landroidx/lifecycle/y0;

    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/j1;->c:Landroidx/lifecycle/y0;

    .line 59
    .line 60
    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j1;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 5
    .line 6
    return-object v0
.end method

.method public final getSavedStateRegistry()Ln3/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j1;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/j1;->e:Ln3/f;

    .line 5
    .line 6
    iget-object v0, v0, Ln3/f;->b:Ln3/e;

    .line 7
    .line 8
    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/b1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j1;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/j1;->b:Landroidx/lifecycle/b1;

    .line 5
    .line 6
    return-object v0
.end method

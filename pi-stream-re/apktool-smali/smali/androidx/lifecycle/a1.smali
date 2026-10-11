.class public final Landroidx/lifecycle/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/b1;

.field public final b:Landroidx/lifecycle/y0;

.field public final c:Ly0/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/b1;Landroidx/fragment/app/v0;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Ly0/a;->b:Ly0/a;

    .line 6
    invoke-direct {p0, p1, p2, v0}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/y0;Ly0/c;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/y0;Ly0/c;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/a1;->a:Landroidx/lifecycle/b1;

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/a1;->b:Landroidx/lifecycle/y0;

    .line 4
    iput-object p3, p0, Landroidx/lifecycle/a1;->c:Ly0/c;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/c1;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Landroidx/lifecycle/c1;->getViewModelStore()Landroidx/lifecycle/b1;

    move-result-object v0

    .line 8
    instance-of v1, p1, Landroidx/lifecycle/j;

    if-eqz v1, :cond_0

    .line 9
    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/j;

    invoke-interface {v2}, Landroidx/lifecycle/j;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/y0;

    move-result-object v2

    goto :goto_0

    .line 10
    :cond_0
    sget-object v2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    if-nez v2, :cond_1

    .line 11
    new-instance v2, Landroidx/lifecycle/z0;

    invoke-direct {v2}, Landroidx/lifecycle/z0;-><init>()V

    .line 12
    sput-object v2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 13
    :cond_1
    sget-object v2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 14
    invoke-static {v2}, Lr6/h0;->q(Ljava/lang/Object;)V

    :goto_0
    if-eqz v1, :cond_2

    .line 15
    check-cast p1, Landroidx/lifecycle/j;

    invoke-interface {p1}, Landroidx/lifecycle/j;->getDefaultViewModelCreationExtras()Ly0/c;

    move-result-object p1

    goto :goto_1

    .line 16
    :cond_2
    sget-object p1, Ly0/a;->b:Ly0/a;

    .line 17
    :goto_1
    invoke-direct {p0, v0, v2, p1}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/y0;Ly0/c;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/c1;Landroidx/lifecycle/y0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p1}, Landroidx/lifecycle/c1;->getViewModelStore()Landroidx/lifecycle/b1;

    move-result-object v0

    .line 19
    instance-of v1, p1, Landroidx/lifecycle/j;

    if-eqz v1, :cond_0

    .line 20
    check-cast p1, Landroidx/lifecycle/j;

    invoke-interface {p1}, Landroidx/lifecycle/j;->getDefaultViewModelCreationExtras()Ly0/c;

    move-result-object p1

    goto :goto_0

    .line 21
    :cond_0
    sget-object p1, Ly0/a;->b:Ly0/a;

    .line 22
    :goto_0
    invoke-direct {p0, v0, p2, p1}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/y0;Ly0/c;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Landroidx/lifecycle/w0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/a1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/a1;->a:Landroidx/lifecycle/b1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Landroidx/lifecycle/b1;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/lifecycle/w0;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, p0, Landroidx/lifecycle/a1;->b:Landroidx/lifecycle/y0;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    instance-of p1, v3, Landroidx/lifecycle/u0;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    check-cast v3, Landroidx/lifecycle/u0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v3, Landroidx/lifecycle/u0;->d:Landroidx/lifecycle/p;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object p2, v3, Landroidx/lifecycle/u0;->e:Ln3/e;

    .line 45
    .line 46
    invoke-static {p2}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p2, p1}, Lcom/bumptech/glide/c;->c(Landroidx/lifecycle/w0;Ln3/e;Landroidx/lifecycle/p;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 53
    .line 54
    invoke-static {v1, p1}, Lr6/h0;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_2
    new-instance v1, Ly0/d;

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/lifecycle/a1;->c:Ly0/c;

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ly0/d;-><init>(Ly0/c;)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Landroidx/lifecycle/q0;->b:Landroidx/lifecycle/q0;

    .line 66
    .line 67
    iget-object v4, v1, Ly0/c;->a:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-interface {v3, p1, v1}, Landroidx/lifecycle/y0;->create(Ljava/lang/Class;Ly0/c;)Landroidx/lifecycle/w0;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_1

    .line 77
    :catch_0
    invoke-interface {v3, p1}, Landroidx/lifecycle/y0;->create(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_1
    const-string v1, "viewModel"

    .line 82
    .line 83
    invoke-static {p1, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v0, Landroidx/lifecycle/b1;->a:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Landroidx/lifecycle/w0;

    .line 93
    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p2}, Landroidx/lifecycle/w0;->onCleared()V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object p1
.end method

.class public final Landroidx/lifecycle/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/y0;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroidx/lifecycle/x0;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroidx/lifecycle/p;

.field public final e:Ln3/e;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ln3/g;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Ln3/g;->getSavedStateRegistry()Ln3/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroidx/lifecycle/u0;->e:Ln3/e;

    .line 14
    .line 15
    invoke-interface {p2}, Landroidx/lifecycle/u;->getLifecycle()Landroidx/lifecycle/p;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Landroidx/lifecycle/u0;->d:Landroidx/lifecycle/p;

    .line 20
    .line 21
    iput-object p3, p0, Landroidx/lifecycle/u0;->c:Landroid/os/Bundle;

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/lifecycle/u0;->a:Landroid/app/Application;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    sget-object p2, Landroidx/lifecycle/x0;->c:Landroidx/lifecycle/x0;

    .line 28
    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    new-instance p2, Landroidx/lifecycle/x0;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Landroidx/lifecycle/x0;-><init>(Landroid/app/Application;)V

    .line 34
    .line 35
    .line 36
    sput-object p2, Landroidx/lifecycle/x0;->c:Landroidx/lifecycle/x0;

    .line 37
    .line 38
    :cond_0
    sget-object p1, Landroidx/lifecycle/x0;->c:Landroidx/lifecycle/x0;

    .line 39
    .line 40
    invoke-static {p1}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p1, Landroidx/lifecycle/x0;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    invoke-direct {p1, p2}, Landroidx/lifecycle/x0;-><init>(Landroid/app/Application;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/u0;->b:Landroidx/lifecycle/x0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;
    .locals 10

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/u0;->d:Landroidx/lifecycle/p;

    .line 7
    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    const-class v1, Landroidx/lifecycle/a;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Landroidx/lifecycle/u0;->a:Landroid/app/Application;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v3, Landroidx/lifecycle/v0;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {p1, v3}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v3, Landroidx/lifecycle/v0;->b:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p1, v3}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    if-nez v3, :cond_3

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object p2, p0, Landroidx/lifecycle/u0;->b:Landroidx/lifecycle/x0;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Landroidx/lifecycle/x0;->create(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object p2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    new-instance p2, Landroidx/lifecycle/z0;

    .line 51
    .line 52
    invoke-direct {p2}, Landroidx/lifecycle/z0;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object p2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 56
    .line 57
    :cond_2
    sget-object p2, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 58
    .line 59
    invoke-static {p2}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, p1}, Landroidx/lifecycle/z0;->create(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    return-object p1

    .line 67
    :cond_3
    iget-object v4, p0, Landroidx/lifecycle/u0;->e:Ln3/e;

    .line 68
    .line 69
    invoke-static {v4}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p2}, Ln3/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    sget-object v6, Landroidx/lifecycle/o0;->f:[Ljava/lang/Class;

    .line 77
    .line 78
    iget-object v6, p0, Landroidx/lifecycle/u0;->c:Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-static {v5, v6}, Lj6/e;->l(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/o0;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Landroidx/lifecycle/p0;

    .line 85
    .line 86
    invoke-direct {v6, p2, v5}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/String;Landroidx/lifecycle/o0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v0, v4}, Landroidx/lifecycle/p0;->a(Landroidx/lifecycle/p;Ln3/e;)V

    .line 90
    .line 91
    .line 92
    move-object p2, v0

    .line 93
    check-cast p2, Landroidx/lifecycle/w;

    .line 94
    .line 95
    iget-object p2, p2, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 96
    .line 97
    sget-object v7, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/o;

    .line 98
    .line 99
    const/4 v8, 0x1

    .line 100
    const/4 v9, 0x0

    .line 101
    if-eq p2, v7, :cond_6

    .line 102
    .line 103
    sget-object v7, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/o;

    .line 104
    .line 105
    invoke-virtual {p2, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-ltz p2, :cond_4

    .line 110
    .line 111
    move p2, v8

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    move p2, v9

    .line 114
    :goto_2
    if-eqz p2, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    new-instance p2, Landroidx/lifecycle/g;

    .line 118
    .line 119
    invoke-direct {p2, v0, v4}, Landroidx/lifecycle/g;-><init>(Landroidx/lifecycle/p;Ln3/e;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p2}, Landroidx/lifecycle/p;->a(Landroidx/lifecycle/t;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    :goto_3
    invoke-virtual {v4}, Ln3/e;->d()V

    .line 127
    .line 128
    .line 129
    :goto_4
    if-eqz v1, :cond_7

    .line 130
    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    const/4 p2, 0x2

    .line 134
    new-array p2, p2, [Ljava/lang/Object;

    .line 135
    .line 136
    aput-object v2, p2, v9

    .line 137
    .line 138
    aput-object v5, p2, v8

    .line 139
    .line 140
    invoke-static {p1, v3, p2}, Landroidx/lifecycle/v0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w0;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    new-array p2, v8, [Ljava/lang/Object;

    .line 146
    .line 147
    aput-object v5, p2, v9

    .line 148
    .line 149
    invoke-static {p1, v3, p2}, Landroidx/lifecycle/v0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w0;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :goto_5
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    .line 154
    .line 155
    invoke-virtual {p1, p2, v6}, Landroidx/lifecycle/w0;->setTagIfAbsent(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 160
    .line 161
    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 162
    .line 163
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w0;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/u0;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;

    move-result-object p1

    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Ly0/c;)Landroidx/lifecycle/w0;
    .locals 5

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Landroidx/lifecycle/q0;->b:Landroidx/lifecycle/q0;

    invoke-virtual {p2, v0}, Ly0/c;->a(Ly0/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 2
    sget-object v1, Lcom/bumptech/glide/d;->a:Landroidx/lifecycle/q0;

    invoke-virtual {p2, v1}, Ly0/c;->a(Ly0/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 3
    sget-object v1, Lcom/bumptech/glide/d;->b:Landroidx/lifecycle/q0;

    invoke-virtual {p2, v1}, Ly0/c;->a(Ly0/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 4
    sget-object v0, Landroidx/lifecycle/q0;->a:Landroidx/lifecycle/q0;

    invoke-virtual {p2, v0}, Ly0/c;->a(Ly0/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-class v1, Landroidx/lifecycle/a;

    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 6
    sget-object v2, Landroidx/lifecycle/v0;->a:Ljava/util/List;

    .line 7
    invoke-static {p1, v2}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 8
    :cond_0
    sget-object v2, Landroidx/lifecycle/v0;->b:Ljava/util/List;

    .line 9
    invoke-static {p1, v2}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    .line 10
    iget-object v0, p0, Landroidx/lifecycle/u0;->b:Landroidx/lifecycle/x0;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/x0;->create(Ljava/lang/Class;Ly0/c;)Landroidx/lifecycle/w0;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    .line 11
    invoke-static {p2}, Lcom/bumptech/glide/d;->p(Ly0/c;)Landroidx/lifecycle/o0;

    move-result-object p2

    aput-object p2, v1, v4

    invoke-static {p1, v2, v1}, Landroidx/lifecycle/v0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w0;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-array v0, v4, [Ljava/lang/Object;

    .line 12
    invoke-static {p2}, Lcom/bumptech/glide/d;->p(Ly0/c;)Landroidx/lifecycle/o0;

    move-result-object p2

    aput-object p2, v0, v3

    invoke-static {p1, v2, v0}, Landroidx/lifecycle/v0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w0;

    move-result-object p1

    goto :goto_1

    .line 13
    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/u0;->d:Landroidx/lifecycle/p;

    if-eqz p2, :cond_4

    .line 14
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/u0;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;

    move-result-object p1

    :goto_1
    return-object p1

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

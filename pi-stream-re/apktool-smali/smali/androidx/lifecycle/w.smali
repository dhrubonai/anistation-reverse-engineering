.class public final Landroidx/lifecycle/w;
.super Landroidx/lifecycle/p;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Ll/a;

.field public c:Landroidx/lifecycle/o;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:Lr7/b;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/u;)V
    .locals 2

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/p;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/lifecycle/w;->a:Z

    .line 11
    .line 12
    new-instance v0, Ll/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ll/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 18
    .line 19
    sget-object v0, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/o;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Landroidx/lifecycle/w;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Landroidx/lifecycle/w;->d:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    new-instance p1, Lr7/b;

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lr7/b;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/lifecycle/w;->i:Lr7/b;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;)V
    .locals 6

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "addObserver"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/w;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/o;->a:Landroidx/lifecycle/o;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/o;

    .line 19
    .line 20
    :goto_0
    new-instance v0, Landroidx/lifecycle/v;

    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/v;-><init>(Landroidx/lifecycle/t;Landroidx/lifecycle/o;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Ll/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroidx/lifecycle/v;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/w;->d:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/lifecycle/u;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    iget v2, p0, Landroidx/lifecycle/w;->e:I

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    iget-boolean v2, p0, Landroidx/lifecycle/w;->f:Z

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 v2, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_1
    move v2, v3

    .line 60
    :goto_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/w;->c(Landroidx/lifecycle/t;)Landroidx/lifecycle/o;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget v5, p0, Landroidx/lifecycle/w;->e:I

    .line 65
    .line 66
    add-int/2addr v5, v3

    .line 67
    iput v5, p0, Landroidx/lifecycle/w;->e:I

    .line 68
    .line 69
    :goto_3
    iget-object v3, v0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-gez v3, :cond_6

    .line 76
    .line 77
    iget-object v3, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 78
    .line 79
    iget-object v3, v3, Ll/a;->e:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v3, v0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 88
    .line 89
    iget-object v4, p0, Landroidx/lifecycle/w;->h:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sget-object v3, Landroidx/lifecycle/n;->Companion:Landroidx/lifecycle/l;

    .line 95
    .line 96
    iget-object v5, v0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v5}, Landroidx/lifecycle/l;->b(Landroidx/lifecycle/o;)Landroidx/lifecycle/n;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    add-int/lit8 v3, v3, -0x1

    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroidx/lifecycle/w;->c(Landroidx/lifecycle/t;)Landroidx/lifecycle/o;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v2, "no event up from "

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_6
    if-nez v2, :cond_7

    .line 147
    .line 148
    invoke-virtual {p0}, Landroidx/lifecycle/w;->h()V

    .line 149
    .line 150
    .line 151
    :cond_7
    iget p1, p0, Landroidx/lifecycle/w;->e:I

    .line 152
    .line 153
    add-int/lit8 p1, p1, -0x1

    .line 154
    .line 155
    iput p1, p0, Landroidx/lifecycle/w;->e:I

    .line 156
    .line 157
    return-void
.end method

.method public final b(Landroidx/lifecycle/t;)V
    .locals 1

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "removeObserver"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/w;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ll/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c(Landroidx/lifecycle/t;)Landroidx/lifecycle/o;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 2
    .line 3
    iget-object v1, v0, Ll/a;->e:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ll/a;->e:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ll/c;

    .line 19
    .line 20
    iget-object p1, p1, Ll/c;->d:Ll/c;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v2

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, Ll/c;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroidx/lifecycle/v;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object p1, v2

    .line 36
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/w;->h:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    xor-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/lit8 v1, v1, -0x1

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Landroidx/lifecycle/o;

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 60
    .line 61
    const-string v1, "state1"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-gez v1, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object p1, v0

    .line 76
    :goto_2
    if-eqz v2, :cond_4

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-gez v0, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v2, p1

    .line 86
    :goto_3
    return-object v2
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/w;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {}, Lk/b;->y()Lk/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lk/b;->l:Lk/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v0, "Method "

    .line 35
    .line 36
    const-string v1, " must be called on the main thread"

    .line 37
    .line 38
    invoke-static {v0, p1, v1}, Lr/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public final e(Landroidx/lifecycle/n;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/w;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/lifecycle/n;->a()Landroidx/lifecycle/o;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/w;->f(Landroidx/lifecycle/o;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f(Landroidx/lifecycle/o;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v1, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/o;

    .line 7
    .line 8
    sget-object v2, Landroidx/lifecycle/o;->a:Landroidx/lifecycle/o;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v0, v1, :cond_2

    .line 13
    .line 14
    if-eq p1, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_2
    :goto_0
    move v0, v4

    .line 20
    :goto_1
    if-eqz v0, :cond_6

    .line 21
    .line 22
    iput-object p1, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 23
    .line 24
    iget-boolean p1, p0, Landroidx/lifecycle/w;->f:Z

    .line 25
    .line 26
    if-nez p1, :cond_5

    .line 27
    .line 28
    iget p1, p0, Landroidx/lifecycle/w;->e:I

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    iput-boolean v4, p0, Landroidx/lifecycle/w;->f:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/lifecycle/w;->h()V

    .line 36
    .line 37
    .line 38
    iput-boolean v3, p0, Landroidx/lifecycle/w;->f:Z

    .line 39
    .line 40
    iget-object p1, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 41
    .line 42
    if-ne p1, v2, :cond_4

    .line 43
    .line 44
    new-instance p1, Ll/a;

    .line 45
    .line 46
    invoke-direct {p1}, Ll/a;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 50
    .line 51
    :cond_4
    return-void

    .line 52
    :cond_5
    :goto_2
    iput-boolean v4, p0, Landroidx/lifecycle/w;->g:Z

    .line 53
    .line 54
    return-void

    .line 55
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, "no event down from "

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, " in component "

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/lifecycle/w;->d:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0
.end method

.method public final g()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/o;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    const-string v1, "setCurrentState"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroidx/lifecycle/w;->d(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/w;->f(Landroidx/lifecycle/o;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/u;

    .line 8
    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 12
    .line 13
    iget v2, v1, Ll/g;->d:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v1, v1, Ll/g;->a:Ll/c;

    .line 21
    .line 22
    invoke-static {v1}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Ll/c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroidx/lifecycle/v;

    .line 28
    .line 29
    iget-object v1, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 32
    .line 33
    iget-object v2, v2, Ll/g;->b:Ll/c;

    .line 34
    .line 35
    invoke-static {v2}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v2, Ll/c;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Landroidx/lifecycle/v;

    .line 41
    .line 42
    iget-object v2, v2, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 43
    .line 44
    if-ne v1, v2, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 47
    .line 48
    if-ne v1, v2, :cond_2

    .line 49
    .line 50
    :goto_0
    move v1, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v1, v4

    .line 53
    :goto_1
    if-nez v1, :cond_8

    .line 54
    .line 55
    iput-boolean v4, p0, Landroidx/lifecycle/w;->g:Z

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 60
    .line 61
    iget-object v2, v2, Ll/g;->a:Ll/c;

    .line 62
    .line 63
    invoke-static {v2}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v2, Ll/c;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Landroidx/lifecycle/v;

    .line 69
    .line 70
    iget-object v2, v2, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Landroidx/lifecycle/w;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    if-gez v1, :cond_5

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 81
    .line 82
    new-instance v4, Ll/b;

    .line 83
    .line 84
    iget-object v5, v1, Ll/g;->b:Ll/c;

    .line 85
    .line 86
    iget-object v6, v1, Ll/g;->a:Ll/c;

    .line 87
    .line 88
    invoke-direct {v4, v5, v6, v3}, Ll/b;-><init>(Ll/c;Ll/c;I)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, Ll/g;->c:Ljava/util/WeakHashMap;

    .line 92
    .line 93
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v1, v4, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v4}, Ll/e;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    iget-boolean v1, p0, Landroidx/lifecycle/w;->g:Z

    .line 105
    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    invoke-virtual {v4}, Ll/e;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/util/Map$Entry;

    .line 113
    .line 114
    const-string v3, "next()"

    .line 115
    .line 116
    invoke-static {v1, v3}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Landroidx/lifecycle/t;

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Landroidx/lifecycle/v;

    .line 130
    .line 131
    :goto_2
    iget-object v5, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 132
    .line 133
    iget-object v6, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 134
    .line 135
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-lez v5, :cond_3

    .line 140
    .line 141
    iget-boolean v5, p0, Landroidx/lifecycle/w;->g:Z

    .line 142
    .line 143
    if-nez v5, :cond_3

    .line 144
    .line 145
    iget-object v5, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 146
    .line 147
    iget-object v5, v5, Ll/a;->e:Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_3

    .line 154
    .line 155
    sget-object v5, Landroidx/lifecycle/n;->Companion:Landroidx/lifecycle/l;

    .line 156
    .line 157
    iget-object v6, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {v6}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/o;)Landroidx/lifecycle/n;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    if-eqz v5, :cond_4

    .line 167
    .line 168
    invoke-virtual {v5}, Landroidx/lifecycle/n;->a()Landroidx/lifecycle/o;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    add-int/lit8 v5, v5, -0x1

    .line 183
    .line 184
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    new-instance v2, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v3, "no event down from "

    .line 193
    .line 194
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object v1, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_5
    iget-object v1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 211
    .line 212
    iget-object v1, v1, Ll/g;->b:Ll/c;

    .line 213
    .line 214
    iget-boolean v3, p0, Landroidx/lifecycle/w;->g:Z

    .line 215
    .line 216
    if-nez v3, :cond_0

    .line 217
    .line 218
    if-eqz v1, :cond_0

    .line 219
    .line 220
    iget-object v3, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 221
    .line 222
    iget-object v1, v1, Ll/c;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Landroidx/lifecycle/v;

    .line 225
    .line 226
    iget-object v1, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 227
    .line 228
    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-lez v1, :cond_0

    .line 233
    .line 234
    iget-object v1, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance v3, Ll/d;

    .line 240
    .line 241
    invoke-direct {v3, v1}, Ll/d;-><init>(Ll/g;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, Ll/g;->c:Ljava/util/WeakHashMap;

    .line 245
    .line 246
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v1, v3, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_6
    invoke-virtual {v3}, Ll/d;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_0

    .line 256
    .line 257
    iget-boolean v1, p0, Landroidx/lifecycle/w;->g:Z

    .line 258
    .line 259
    if-nez v1, :cond_0

    .line 260
    .line 261
    invoke-virtual {v3}, Ll/d;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Ljava/util/Map$Entry;

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    check-cast v4, Landroidx/lifecycle/t;

    .line 272
    .line 273
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, Landroidx/lifecycle/v;

    .line 278
    .line 279
    :goto_3
    iget-object v5, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 280
    .line 281
    iget-object v6, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 282
    .line 283
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-gez v5, :cond_6

    .line 288
    .line 289
    iget-boolean v5, p0, Landroidx/lifecycle/w;->g:Z

    .line 290
    .line 291
    if-nez v5, :cond_6

    .line 292
    .line 293
    iget-object v5, p0, Landroidx/lifecycle/w;->b:Ll/a;

    .line 294
    .line 295
    iget-object v5, v5, Ll/a;->e:Ljava/util/HashMap;

    .line 296
    .line 297
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eqz v5, :cond_6

    .line 302
    .line 303
    iget-object v5, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 304
    .line 305
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    sget-object v5, Landroidx/lifecycle/n;->Companion:Landroidx/lifecycle/l;

    .line 309
    .line 310
    iget-object v6, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {v6}, Landroidx/lifecycle/l;->b(Landroidx/lifecycle/o;)Landroidx/lifecycle/n;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    if-eqz v5, :cond_7

    .line 320
    .line 321
    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    add-int/lit8 v5, v5, -0x1

    .line 329
    .line 330
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    new-instance v2, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v3, "no event up from "

    .line 339
    .line 340
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iget-object v1, v1, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 344
    .line 345
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :cond_8
    iput-boolean v4, p0, Landroidx/lifecycle/w;->g:Z

    .line 357
    .line 358
    iget-object v0, p0, Landroidx/lifecycle/w;->i:Lr7/b;

    .line 359
    .line 360
    iget-object v1, p0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Lr7/b;->n(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 367
    .line 368
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 369
    .line 370
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v0
.end method

.class public abstract Landroidx/fragment/app/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Lc/e;

.field public B:Lc/e;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:Landroidx/fragment/app/w0;

.field public final M:Landroidx/fragment/app/e;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Li/g;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/g0;

.field public g:Landroidx/activity/r;

.field public final h:Landroidx/fragment/app/k0;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Landroidx/fragment/app/h0;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Landroidx/fragment/app/i0;

.field public final o:Landroidx/fragment/app/i0;

.field public final p:Landroidx/fragment/app/i0;

.field public final q:Landroidx/fragment/app/i0;

.field public final r:Landroidx/fragment/app/l0;

.field public s:I

.field public t:Landroidx/fragment/app/a0;

.field public u:Lcom/bumptech/glide/c;

.field public v:Landroidx/fragment/app/y;

.field public w:Landroidx/fragment/app/y;

.field public final x:Landroidx/fragment/app/m0;

.field public final y:Landroidx/fragment/app/j0;

.field public z:Lc/e;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Li/g;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, Li/g;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 18
    .line 19
    new-instance v0, Landroidx/fragment/app/g0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroidx/fragment/app/g0;-><init>(Landroidx/fragment/app/s0;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/fragment/app/s0;->f:Landroidx/fragment/app/g0;

    .line 25
    .line 26
    new-instance v0, Landroidx/fragment/app/k0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/s0;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/fragment/app/s0;->h:Landroidx/fragment/app/k0;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Landroidx/fragment/app/s0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    new-instance v0, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Landroidx/fragment/app/s0;->j:Ljava/util/Map;

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Landroidx/fragment/app/s0;->k:Ljava/util/Map;

    .line 61
    .line 62
    new-instance v0, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroidx/fragment/app/h0;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Landroidx/fragment/app/h0;-><init>(Landroidx/fragment/app/s0;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Landroidx/fragment/app/s0;->l:Landroidx/fragment/app/h0;

    .line 76
    .line 77
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Landroidx/fragment/app/s0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 83
    .line 84
    new-instance v0, Landroidx/fragment/app/i0;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/i0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Landroidx/fragment/app/s0;->n:Landroidx/fragment/app/i0;

    .line 91
    .line 92
    new-instance v0, Landroidx/fragment/app/i0;

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/i0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Landroidx/fragment/app/s0;->o:Landroidx/fragment/app/i0;

    .line 99
    .line 100
    new-instance v0, Landroidx/fragment/app/i0;

    .line 101
    .line 102
    const/4 v2, 0x2

    .line 103
    invoke-direct {v0, p0, v2}, Landroidx/fragment/app/i0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Landroidx/fragment/app/s0;->p:Landroidx/fragment/app/i0;

    .line 107
    .line 108
    new-instance v0, Landroidx/fragment/app/i0;

    .line 109
    .line 110
    const/4 v3, 0x3

    .line 111
    invoke-direct {v0, p0, v3}, Landroidx/fragment/app/i0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Landroidx/fragment/app/s0;->q:Landroidx/fragment/app/i0;

    .line 115
    .line 116
    new-instance v0, Landroidx/fragment/app/l0;

    .line 117
    .line 118
    invoke-direct {v0, p0}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/s0;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Landroidx/fragment/app/s0;->r:Landroidx/fragment/app/l0;

    .line 122
    .line 123
    const/4 v0, -0x1

    .line 124
    iput v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 125
    .line 126
    new-instance v0, Landroidx/fragment/app/m0;

    .line 127
    .line 128
    invoke-direct {v0, p0}, Landroidx/fragment/app/m0;-><init>(Landroidx/fragment/app/s0;)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, Landroidx/fragment/app/s0;->x:Landroidx/fragment/app/m0;

    .line 132
    .line 133
    new-instance v0, Landroidx/fragment/app/j0;

    .line 134
    .line 135
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, Landroidx/fragment/app/s0;->y:Landroidx/fragment/app/j0;

    .line 139
    .line 140
    new-instance v0, Ljava/util/ArrayDeque;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, Landroidx/fragment/app/s0;->C:Ljava/util/ArrayDeque;

    .line 146
    .line 147
    new-instance v0, Landroidx/fragment/app/e;

    .line 148
    .line 149
    invoke-direct {v0, p0, v2}, Landroidx/fragment/app/e;-><init>(Ljava/lang/Object;I)V

    .line 150
    .line 151
    .line 152
    iput-object v0, p0, Landroidx/fragment/app/s0;->M:Landroidx/fragment/app/e;

    .line 153
    .line 154
    return-void
.end method

.method public static H(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    return p0
.end method

.method public static I(Landroidx/fragment/app/y;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 4
    .line 5
    invoke-virtual {p0}, Li/g;->z()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/y;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :cond_1
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    :cond_2
    return v0
.end method

.method public static J(Landroidx/fragment/app/y;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Landroidx/fragment/app/y;->S:Z

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/y;->L:Landroidx/fragment/app/y;

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/fragment/app/s0;->J(Landroidx/fragment/app/y;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :cond_2
    :goto_0
    return v0
.end method

.method public static K(Landroidx/fragment/app/y;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroidx/fragment/app/y;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-object p0, v1, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/fragment/app/s0;->K(Landroidx/fragment/app/y;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
.end method

.method public static Z(Landroidx/fragment/app/y;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/y;->P:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/y;->P:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/fragment/app/y;->Z:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/fragment/app/y;->Z:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Landroidx/fragment/app/y;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/g;->s(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final B(I)Landroidx/fragment/app/y;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    iget-object v1, v0, Li/g;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Li/g;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/fragment/app/y;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget v3, v2, Landroidx/fragment/app/y;->M:I

    .line 28
    .line 29
    if-ne v3, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, v0, Li/g;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Landroidx/fragment/app/z0;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v2, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 59
    .line 60
    iget v1, v2, Landroidx/fragment/app/y;->M:I

    .line 61
    .line 62
    if-ne v1, p1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v2, 0x0

    .line 66
    :goto_0
    return-object v2
.end method

.method public final C(Ljava/lang/String;)Landroidx/fragment/app/y;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    iget-object v1, v0, Li/g;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Li/g;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/fragment/app/y;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v3, v2, Landroidx/fragment/app/y;->O:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Li/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroidx/fragment/app/z0;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v2, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 63
    .line 64
    iget-object v1, v2, Landroidx/fragment/app/y;->O:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 v2, 0x0

    .line 74
    :goto_0
    return-object v2
.end method

.method public final D(Landroidx/fragment/app/y;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Landroidx/fragment/app/y;->N:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-gtz v0, :cond_1

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/bumptech/glide/c;->Q()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 21
    .line 22
    iget p1, p1, Landroidx/fragment/app/y;->N:I

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/c;->P(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast p1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    return-object v1
.end method

.method public final E()Landroidx/fragment/app/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->E()Landroidx/fragment/app/m0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->x:Landroidx/fragment/app/m0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final F()Landroidx/fragment/app/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->y:Landroidx/fragment/app/j0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final G(Landroidx/fragment/app/y;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/y;->P:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Landroidx/fragment/app/y;->P:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/y;->Z:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Landroidx/fragment/app/y;->Z:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->Y(Landroidx/fragment/app/y;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final L(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Landroidx/fragment/app/s0;->s:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iput p1, p0, Landroidx/fragment/app/s0;->s:I

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 27
    .line 28
    iget-object p2, p1, Li/g;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p1, Li/g;->b:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroidx/fragment/app/y;

    .line 49
    .line 50
    check-cast v1, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v0, v0, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroidx/fragment/app/z0;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/z0;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    check-cast v1, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x0

    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroidx/fragment/app/z0;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/fragment/app/z0;->k()V

    .line 92
    .line 93
    .line 94
    iget-object v2, v0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 95
    .line 96
    iget-boolean v3, v2, Landroidx/fragment/app/y;->C:Z

    .line 97
    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/fragment/app/y;->s()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    :cond_6
    if-eqz v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Li/g;->H(Landroidx/fragment/app/z0;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->a0()V

    .line 114
    .line 115
    .line 116
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 117
    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 121
    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    iget p2, p0, Landroidx/fragment/app/s0;->s:I

    .line 125
    .line 126
    const/4 v0, 0x7

    .line 127
    if-ne p2, v0, :cond_8

    .line 128
    .line 129
    iget-object p1, p1, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 132
    .line 133
    .line 134
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 135
    .line 136
    :cond_8
    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->F:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/w0;->f:Z

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 16
    .line 17
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroidx/fragment/app/y;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->M()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method public final N()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/s0;->O(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final O(II)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/s0;->w(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/y;->j()Landroidx/fragment/app/s0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/s0;->N()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, p1, p2}, Landroidx/fragment/app/s0;->P(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v1}, Landroidx/fragment/app/s0;->R(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->b0()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Landroidx/fragment/app/s0;->H:Z

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->H:Z

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->a0()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 67
    .line 68
    invoke-virtual {p2}, Li/g;->m()V

    .line 69
    .line 70
    .line 71
    return p1
.end method

.method public final P(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_a

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_5

    .line 27
    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/2addr v3, p3

    .line 34
    goto :goto_5

    .line 35
    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v3

    .line 42
    :goto_1
    if-ltz v2, :cond_5

    .line 43
    .line 44
    iget-object v4, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Landroidx/fragment/app/a;

    .line 51
    .line 52
    if-ltz p3, :cond_4

    .line 53
    .line 54
    iget v4, v4, Landroidx/fragment/app/a;->r:I

    .line 55
    .line 56
    if-ne p3, v4, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    :goto_2
    if-gez v2, :cond_7

    .line 63
    .line 64
    :cond_6
    :goto_3
    move v3, v2

    .line 65
    goto :goto_5

    .line 66
    :cond_7
    if-eqz p4, :cond_8

    .line 67
    .line 68
    :goto_4
    if-lez v2, :cond_6

    .line 69
    .line 70
    iget-object p4, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v3, v2, -0x1

    .line 73
    .line 74
    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Landroidx/fragment/app/a;

    .line 79
    .line 80
    if-ltz p3, :cond_6

    .line 81
    .line 82
    iget p4, p4, Landroidx/fragment/app/a;->r:I

    .line 83
    .line 84
    if-ne p3, p4, :cond_6

    .line 85
    .line 86
    move v2, v3

    .line 87
    goto :goto_4

    .line 88
    :cond_8
    iget-object p3, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    add-int/2addr p3, v3

    .line 95
    if-ne v2, p3, :cond_9

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_a
    :goto_5
    if-gez v3, :cond_b

    .line 102
    .line 103
    return v1

    .line 104
    :cond_b
    iget-object p3, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p3, v0

    .line 111
    :goto_6
    if-lt p3, v3, :cond_c

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    check-cast p4, Landroidx/fragment/app/a;

    .line 120
    .line 121
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p3, p3, -0x1

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_c
    return v0
.end method

.method public final Q(Landroidx/fragment/app/y;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "remove: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " nesting="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p1, Landroidx/fragment/app/y;->H:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "FragmentManager"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/y;->s()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    xor-int/2addr v0, v1

    .line 43
    iget-boolean v2, p1, Landroidx/fragment/app/y;->Q:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 50
    .line 51
    iget-object v2, v0, Li/g;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v2

    .line 56
    :try_start_0
    iget-object v0, v0, Li/g;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Landroidx/fragment/app/y;->B:Z

    .line 66
    .line 67
    invoke-static {p1}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 74
    .line 75
    :cond_2
    iput-boolean v1, p1, Landroidx/fragment/app/y;->C:Z

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->Y(Landroidx/fragment/app/y;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw p1
.end method

.method public final R(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroidx/fragment/app/a;

    .line 31
    .line 32
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/s0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/fragment/app/a;

    .line 74
    .line 75
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/s0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/s0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    return-void

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p2, "Internal error with the back stack records"

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public final S(Landroid/os/Parcelable;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "result_"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v5, v0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 42
    .line 43
    iget-object v5, v5, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x7

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v5, v0, Landroidx/fragment/app/s0;->k:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-string v5, "state"

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "fragment_"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v6, v0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 105
    .line 106
    iget-object v6, v6, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Landroidx/fragment/app/y0;

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 126
    .line 127
    iget-object v4, v3, Li/g;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_4

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Landroidx/fragment/app/y0;

    .line 149
    .line 150
    iget-object v6, v3, Li/g;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, Ljava/util/HashMap;

    .line 153
    .line 154
    iget-object v7, v4, Landroidx/fragment/app/y0;->b:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v6, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Landroidx/fragment/app/u0;

    .line 165
    .line 166
    if-nez v1, :cond_5

    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    iget-object v2, v3, Li/g;->b:Ljava/lang/Object;

    .line 170
    .line 171
    move-object v4, v2

    .line 172
    check-cast v4, Ljava/util/HashMap;

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 175
    .line 176
    .line 177
    iget-object v4, v1, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    iget-object v6, v0, Landroidx/fragment/app/s0;->l:Landroidx/fragment/app/h0;

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const-string v8, "): "

    .line 191
    .line 192
    const/4 v9, 0x2

    .line 193
    const-string v10, "FragmentManager"

    .line 194
    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v3, v5, v7}, Li/g;->R(Ljava/lang/String;Landroidx/fragment/app/y0;)Landroidx/fragment/app/y0;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    if-eqz v5, :cond_6

    .line 208
    .line 209
    iget-object v7, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 210
    .line 211
    iget-object v7, v7, Landroidx/fragment/app/w0;->a:Ljava/util/HashMap;

    .line 212
    .line 213
    iget-object v11, v5, Landroidx/fragment/app/y0;->b:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Landroidx/fragment/app/y;

    .line 220
    .line 221
    if-eqz v7, :cond_8

    .line 222
    .line 223
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-eqz v11, :cond_7

    .line 228
    .line 229
    new-instance v11, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v12, "restoreSaveState: re-attaching retained "

    .line 232
    .line 233
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    :cond_7
    new-instance v11, Landroidx/fragment/app/z0;

    .line 247
    .line 248
    invoke-direct {v11, v6, v3, v7, v5}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/h0;Li/g;Landroidx/fragment/app/y;Landroidx/fragment/app/y0;)V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_8
    new-instance v6, Landroidx/fragment/app/z0;

    .line 253
    .line 254
    iget-object v12, v0, Landroidx/fragment/app/s0;->l:Landroidx/fragment/app/h0;

    .line 255
    .line 256
    iget-object v13, v0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 257
    .line 258
    iget-object v7, v0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 259
    .line 260
    iget-object v7, v7, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 261
    .line 262
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/s0;->E()Landroidx/fragment/app/m0;

    .line 267
    .line 268
    .line 269
    move-result-object v15

    .line 270
    move-object v11, v6

    .line 271
    move-object/from16 v16, v5

    .line 272
    .line 273
    invoke-direct/range {v11 .. v16}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/h0;Li/g;Ljava/lang/ClassLoader;Landroidx/fragment/app/m0;Landroidx/fragment/app/y0;)V

    .line 274
    .line 275
    .line 276
    :goto_4
    iget-object v5, v11, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 277
    .line 278
    iput-object v0, v5, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 279
    .line 280
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-eqz v6, :cond_9

    .line 285
    .line 286
    new-instance v6, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    const-string v7, "restoreSaveState: active ("

    .line 289
    .line 290
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    iget-object v7, v5, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    :cond_9
    iget-object v5, v0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 312
    .line 313
    iget-object v5, v5, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 314
    .line 315
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v11, v5}, Landroidx/fragment/app/z0;->m(Ljava/lang/ClassLoader;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v11}, Li/g;->G(Landroidx/fragment/app/z0;)V

    .line 323
    .line 324
    .line 325
    iget v5, v0, Landroidx/fragment/app/s0;->s:I

    .line 326
    .line 327
    iput v5, v11, Landroidx/fragment/app/z0;->e:I

    .line 328
    .line 329
    goto/16 :goto_3

    .line 330
    .line 331
    :cond_a
    iget-object v4, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 332
    .line 333
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance v5, Ljava/util/ArrayList;

    .line 337
    .line 338
    iget-object v4, v4, Landroidx/fragment/app/w0;->a:Ljava/util/HashMap;

    .line 339
    .line 340
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    const/4 v11, 0x0

    .line 356
    const/4 v12, 0x1

    .line 357
    if-eqz v5, :cond_e

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    check-cast v5, Landroidx/fragment/app/y;

    .line 364
    .line 365
    iget-object v13, v5, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 366
    .line 367
    move-object v14, v2

    .line 368
    check-cast v14, Ljava/util/HashMap;

    .line 369
    .line 370
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v13

    .line 374
    if-eqz v13, :cond_c

    .line 375
    .line 376
    move v11, v12

    .line 377
    :cond_c
    if-nez v11, :cond_b

    .line 378
    .line 379
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    if-eqz v11, :cond_d

    .line 384
    .line 385
    new-instance v11, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v13, "Discarding retained Fragment "

    .line 388
    .line 389
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v13, " that was not found in the set of active Fragments "

    .line 396
    .line 397
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    iget-object v13, v1, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 410
    .line 411
    .line 412
    :cond_d
    iget-object v11, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 413
    .line 414
    invoke-virtual {v11, v5}, Landroidx/fragment/app/w0;->d(Landroidx/fragment/app/y;)V

    .line 415
    .line 416
    .line 417
    iput-object v0, v5, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 418
    .line 419
    new-instance v11, Landroidx/fragment/app/z0;

    .line 420
    .line 421
    invoke-direct {v11, v6, v3, v5}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/h0;Li/g;Landroidx/fragment/app/y;)V

    .line 422
    .line 423
    .line 424
    iput v12, v11, Landroidx/fragment/app/z0;->e:I

    .line 425
    .line 426
    invoke-virtual {v11}, Landroidx/fragment/app/z0;->k()V

    .line 427
    .line 428
    .line 429
    iput-boolean v12, v5, Landroidx/fragment/app/y;->C:Z

    .line 430
    .line 431
    invoke-virtual {v11}, Landroidx/fragment/app/z0;->k()V

    .line 432
    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_e
    iget-object v2, v1, Landroidx/fragment/app/u0;->b:Ljava/util/ArrayList;

    .line 436
    .line 437
    iget-object v4, v3, Li/g;->d:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v4, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 442
    .line 443
    .line 444
    if-eqz v2, :cond_11

    .line 445
    .line 446
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    if-eqz v4, :cond_11

    .line 455
    .line 456
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    check-cast v4, Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v3, v4}, Li/g;->s(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    if-eqz v5, :cond_10

    .line 467
    .line 468
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    if-eqz v6, :cond_f

    .line 473
    .line 474
    new-instance v6, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    const-string v13, "restoreSaveState: added ("

    .line 477
    .line 478
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 495
    .line 496
    .line 497
    :cond_f
    invoke-virtual {v3, v5}, Li/g;->h(Landroidx/fragment/app/y;)V

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 502
    .line 503
    const-string v2, "No instantiated fragment for ("

    .line 504
    .line 505
    const-string v3, ")"

    .line 506
    .line 507
    invoke-static {v2, v4, v3}, Lr/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v1

    .line 515
    :cond_11
    iget-object v2, v1, Landroidx/fragment/app/u0;->c:[Landroidx/fragment/app/b;

    .line 516
    .line 517
    if-eqz v2, :cond_18

    .line 518
    .line 519
    new-instance v2, Ljava/util/ArrayList;

    .line 520
    .line 521
    iget-object v3, v1, Landroidx/fragment/app/u0;->c:[Landroidx/fragment/app/b;

    .line 522
    .line 523
    array-length v3, v3

    .line 524
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 525
    .line 526
    .line 527
    iput-object v2, v0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 528
    .line 529
    move v2, v11

    .line 530
    :goto_7
    iget-object v3, v1, Landroidx/fragment/app/u0;->c:[Landroidx/fragment/app/b;

    .line 531
    .line 532
    array-length v4, v3

    .line 533
    if-ge v2, v4, :cond_19

    .line 534
    .line 535
    aget-object v3, v3, v2

    .line 536
    .line 537
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    new-instance v4, Landroidx/fragment/app/a;

    .line 541
    .line 542
    invoke-direct {v4, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/s0;)V

    .line 543
    .line 544
    .line 545
    move v5, v11

    .line 546
    move v6, v5

    .line 547
    :goto_8
    iget-object v7, v3, Landroidx/fragment/app/b;->a:[I

    .line 548
    .line 549
    array-length v13, v7

    .line 550
    if-ge v5, v13, :cond_14

    .line 551
    .line 552
    new-instance v13, Landroidx/fragment/app/a1;

    .line 553
    .line 554
    invoke-direct {v13}, Landroidx/fragment/app/a1;-><init>()V

    .line 555
    .line 556
    .line 557
    add-int/lit8 v14, v5, 0x1

    .line 558
    .line 559
    aget v5, v7, v5

    .line 560
    .line 561
    iput v5, v13, Landroidx/fragment/app/a1;->a:I

    .line 562
    .line 563
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-eqz v5, :cond_12

    .line 568
    .line 569
    new-instance v5, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v15, "Instantiate "

    .line 572
    .line 573
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v15, " op #"

    .line 580
    .line 581
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string v15, " base fragment #"

    .line 588
    .line 589
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    aget v15, v7, v14

    .line 593
    .line 594
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    .line 603
    .line 604
    :cond_12
    invoke-static {}, Landroidx/lifecycle/o;->values()[Landroidx/lifecycle/o;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    iget-object v15, v3, Landroidx/fragment/app/b;->c:[I

    .line 609
    .line 610
    aget v15, v15, v6

    .line 611
    .line 612
    aget-object v5, v5, v15

    .line 613
    .line 614
    iput-object v5, v13, Landroidx/fragment/app/a1;->h:Landroidx/lifecycle/o;

    .line 615
    .line 616
    invoke-static {}, Landroidx/lifecycle/o;->values()[Landroidx/lifecycle/o;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    iget-object v15, v3, Landroidx/fragment/app/b;->d:[I

    .line 621
    .line 622
    aget v15, v15, v6

    .line 623
    .line 624
    aget-object v5, v5, v15

    .line 625
    .line 626
    iput-object v5, v13, Landroidx/fragment/app/a1;->i:Landroidx/lifecycle/o;

    .line 627
    .line 628
    add-int/lit8 v5, v14, 0x1

    .line 629
    .line 630
    aget v14, v7, v14

    .line 631
    .line 632
    if-eqz v14, :cond_13

    .line 633
    .line 634
    move v14, v12

    .line 635
    goto :goto_9

    .line 636
    :cond_13
    move v14, v11

    .line 637
    :goto_9
    iput-boolean v14, v13, Landroidx/fragment/app/a1;->c:Z

    .line 638
    .line 639
    add-int/lit8 v14, v5, 0x1

    .line 640
    .line 641
    aget v5, v7, v5

    .line 642
    .line 643
    iput v5, v13, Landroidx/fragment/app/a1;->d:I

    .line 644
    .line 645
    add-int/lit8 v15, v14, 0x1

    .line 646
    .line 647
    aget v14, v7, v14

    .line 648
    .line 649
    iput v14, v13, Landroidx/fragment/app/a1;->e:I

    .line 650
    .line 651
    add-int/lit8 v16, v15, 0x1

    .line 652
    .line 653
    aget v15, v7, v15

    .line 654
    .line 655
    iput v15, v13, Landroidx/fragment/app/a1;->f:I

    .line 656
    .line 657
    add-int/lit8 v17, v16, 0x1

    .line 658
    .line 659
    aget v7, v7, v16

    .line 660
    .line 661
    iput v7, v13, Landroidx/fragment/app/a1;->g:I

    .line 662
    .line 663
    iput v5, v4, Landroidx/fragment/app/a;->b:I

    .line 664
    .line 665
    iput v14, v4, Landroidx/fragment/app/a;->c:I

    .line 666
    .line 667
    iput v15, v4, Landroidx/fragment/app/a;->d:I

    .line 668
    .line 669
    iput v7, v4, Landroidx/fragment/app/a;->e:I

    .line 670
    .line 671
    invoke-virtual {v4, v13}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/a1;)V

    .line 672
    .line 673
    .line 674
    add-int/lit8 v6, v6, 0x1

    .line 675
    .line 676
    move/from16 v5, v17

    .line 677
    .line 678
    goto/16 :goto_8

    .line 679
    .line 680
    :cond_14
    iget v5, v3, Landroidx/fragment/app/b;->e:I

    .line 681
    .line 682
    iput v5, v4, Landroidx/fragment/app/a;->f:I

    .line 683
    .line 684
    iget-object v5, v3, Landroidx/fragment/app/b;->f:Ljava/lang/String;

    .line 685
    .line 686
    iput-object v5, v4, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 687
    .line 688
    iput-boolean v12, v4, Landroidx/fragment/app/a;->g:Z

    .line 689
    .line 690
    iget v5, v3, Landroidx/fragment/app/b;->y:I

    .line 691
    .line 692
    iput v5, v4, Landroidx/fragment/app/a;->i:I

    .line 693
    .line 694
    iget-object v5, v3, Landroidx/fragment/app/b;->z:Ljava/lang/CharSequence;

    .line 695
    .line 696
    iput-object v5, v4, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    .line 697
    .line 698
    iget v5, v3, Landroidx/fragment/app/b;->A:I

    .line 699
    .line 700
    iput v5, v4, Landroidx/fragment/app/a;->k:I

    .line 701
    .line 702
    iget-object v5, v3, Landroidx/fragment/app/b;->B:Ljava/lang/CharSequence;

    .line 703
    .line 704
    iput-object v5, v4, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    .line 705
    .line 706
    iget-object v5, v3, Landroidx/fragment/app/b;->C:Ljava/util/ArrayList;

    .line 707
    .line 708
    iput-object v5, v4, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    .line 709
    .line 710
    iget-object v5, v3, Landroidx/fragment/app/b;->D:Ljava/util/ArrayList;

    .line 711
    .line 712
    iput-object v5, v4, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 713
    .line 714
    iget-boolean v5, v3, Landroidx/fragment/app/b;->E:Z

    .line 715
    .line 716
    iput-boolean v5, v4, Landroidx/fragment/app/a;->o:Z

    .line 717
    .line 718
    iget v5, v3, Landroidx/fragment/app/b;->x:I

    .line 719
    .line 720
    iput v5, v4, Landroidx/fragment/app/a;->r:I

    .line 721
    .line 722
    move v5, v11

    .line 723
    :goto_a
    iget-object v6, v3, Landroidx/fragment/app/b;->b:Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 726
    .line 727
    .line 728
    move-result v7

    .line 729
    if-ge v5, v7, :cond_16

    .line 730
    .line 731
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    check-cast v6, Ljava/lang/String;

    .line 736
    .line 737
    if-eqz v6, :cond_15

    .line 738
    .line 739
    iget-object v7, v4, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 740
    .line 741
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    check-cast v7, Landroidx/fragment/app/a1;

    .line 746
    .line 747
    invoke-virtual {v0, v6}, Landroidx/fragment/app/s0;->A(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 748
    .line 749
    .line 750
    move-result-object v6

    .line 751
    iput-object v6, v7, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 752
    .line 753
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 754
    .line 755
    goto :goto_a

    .line 756
    :cond_16
    invoke-virtual {v4, v12}, Landroidx/fragment/app/a;->c(I)V

    .line 757
    .line 758
    .line 759
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    if-eqz v3, :cond_17

    .line 764
    .line 765
    const-string v3, "restoreAllState: back stack #"

    .line 766
    .line 767
    const-string v5, " (index "

    .line 768
    .line 769
    invoke-static {v3, v2, v5}, La3/g;->u(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    iget v5, v4, Landroidx/fragment/app/a;->r:I

    .line 774
    .line 775
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    invoke-static {v10, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 789
    .line 790
    .line 791
    new-instance v3, Landroidx/fragment/app/k1;

    .line 792
    .line 793
    invoke-direct {v3}, Landroidx/fragment/app/k1;-><init>()V

    .line 794
    .line 795
    .line 796
    new-instance v5, Ljava/io/PrintWriter;

    .line 797
    .line 798
    invoke-direct {v5, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 799
    .line 800
    .line 801
    const-string v3, "  "

    .line 802
    .line 803
    invoke-virtual {v4, v3, v5, v11}, Landroidx/fragment/app/a;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 807
    .line 808
    .line 809
    :cond_17
    iget-object v3, v0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 810
    .line 811
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    add-int/lit8 v2, v2, 0x1

    .line 815
    .line 816
    goto/16 :goto_7

    .line 817
    .line 818
    :cond_18
    iput-object v7, v0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 819
    .line 820
    :cond_19
    iget-object v2, v0, Landroidx/fragment/app/s0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 821
    .line 822
    iget v3, v1, Landroidx/fragment/app/u0;->d:I

    .line 823
    .line 824
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 825
    .line 826
    .line 827
    iget-object v2, v1, Landroidx/fragment/app/u0;->e:Ljava/lang/String;

    .line 828
    .line 829
    if-eqz v2, :cond_1a

    .line 830
    .line 831
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->A(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    iput-object v2, v0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 836
    .line 837
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->q(Landroidx/fragment/app/y;)V

    .line 838
    .line 839
    .line 840
    :cond_1a
    iget-object v2, v1, Landroidx/fragment/app/u0;->f:Ljava/util/ArrayList;

    .line 841
    .line 842
    if-eqz v2, :cond_1b

    .line 843
    .line 844
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-ge v11, v3, :cond_1b

    .line 849
    .line 850
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    check-cast v3, Ljava/lang/String;

    .line 855
    .line 856
    iget-object v4, v1, Landroidx/fragment/app/u0;->x:Ljava/util/ArrayList;

    .line 857
    .line 858
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    check-cast v4, Landroidx/fragment/app/c;

    .line 863
    .line 864
    iget-object v5, v0, Landroidx/fragment/app/s0;->j:Ljava/util/Map;

    .line 865
    .line 866
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    add-int/lit8 v11, v11, 0x1

    .line 870
    .line 871
    goto :goto_b

    .line 872
    :cond_1b
    new-instance v2, Ljava/util/ArrayDeque;

    .line 873
    .line 874
    iget-object v1, v1, Landroidx/fragment/app/u0;->y:Ljava/util/ArrayList;

    .line 875
    .line 876
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 877
    .line 878
    .line 879
    iput-object v2, v0, Landroidx/fragment/app/s0;->C:Ljava/util/ArrayDeque;

    .line 880
    .line 881
    return-void
.end method

.method public final T()Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->e()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/n1;

    .line 27
    .line 28
    iget-boolean v5, v2, Landroidx/fragment/app/n1;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const-string v4, "FragmentManager"

    .line 39
    .line 40
    const-string v5, "SpecialEffectsController: Forcing postponed operations"

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v3, v2, Landroidx/fragment/app/n1;->e:Z

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/fragment/app/n1;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->e()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Landroidx/fragment/app/n1;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/fragment/app/n1;->e()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v1, 0x1

    .line 76
    invoke-virtual {p0, v1}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->E:Z

    .line 80
    .line 81
    iget-object v2, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 82
    .line 83
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->f:Z

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v1, v1, Li/g;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Landroidx/fragment/app/z0;

    .line 122
    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-virtual {v5}, Landroidx/fragment/app/z0;->o()V

    .line 126
    .line 127
    .line 128
    iget-object v5, v5, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 129
    .line 130
    iget-object v6, v5, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_4

    .line 140
    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v7, "Saved state of "

    .line 144
    .line 145
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v7, ": "

    .line 152
    .line 153
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    iget-object v5, v5, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 157
    .line 158
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    const-string v6, "FragmentManager"

    .line 166
    .line 167
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v5, Ljava/util/ArrayList;

    .line 177
    .line 178
    iget-object v1, v1, Li/g;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_e

    .line 200
    .line 201
    const-string v1, "FragmentManager"

    .line 202
    .line 203
    const-string v2, "saveAllState: no fragments!"

    .line 204
    .line 205
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 211
    .line 212
    iget-object v6, v1, Li/g;->d:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v6, Ljava/util/ArrayList;

    .line 215
    .line 216
    monitor-enter v6

    .line 217
    :try_start_0
    iget-object v7, v1, Li/g;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v7, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    const/4 v8, 0x0

    .line 226
    if-eqz v7, :cond_7

    .line 227
    .line 228
    monitor-exit v6

    .line 229
    move-object v7, v8

    .line 230
    goto :goto_4

    .line 231
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 232
    .line 233
    iget-object v9, v1, Li/g;->d:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v9, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, Li/g;->d:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    if-eqz v9, :cond_9

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    check-cast v9, Landroidx/fragment/app/y;

    .line 263
    .line 264
    iget-object v10, v9, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    if-eqz v10, :cond_8

    .line 274
    .line 275
    const-string v10, "FragmentManager"

    .line 276
    .line 277
    new-instance v11, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    const-string v12, "saveAllState: adding fragment ("

    .line 283
    .line 284
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget-object v12, v9, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v12, "): "

    .line 293
    .line 294
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_9
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    :goto_4
    iget-object v1, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 310
    .line 311
    if-eqz v1, :cond_b

    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-lez v1, :cond_b

    .line 318
    .line 319
    new-array v8, v1, [Landroidx/fragment/app/b;

    .line 320
    .line 321
    :goto_5
    if-ge v3, v1, :cond_b

    .line 322
    .line 323
    new-instance v6, Landroidx/fragment/app/b;

    .line 324
    .line 325
    iget-object v9, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    check-cast v9, Landroidx/fragment/app/a;

    .line 332
    .line 333
    invoke-direct {v6, v9}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    .line 334
    .line 335
    .line 336
    aput-object v6, v8, v3

    .line 337
    .line 338
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 339
    .line 340
    .line 341
    move-result v6

    .line 342
    if-eqz v6, :cond_a

    .line 343
    .line 344
    const-string v6, "FragmentManager"

    .line 345
    .line 346
    const-string v9, "saveAllState: adding back stack #"

    .line 347
    .line 348
    const-string v10, ": "

    .line 349
    .line 350
    invoke-static {v9, v3, v10}, La3/g;->u(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    iget-object v10, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    invoke-static {v6, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 368
    .line 369
    .line 370
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_b
    new-instance v1, Landroidx/fragment/app/u0;

    .line 374
    .line 375
    invoke-direct {v1}, Landroidx/fragment/app/u0;-><init>()V

    .line 376
    .line 377
    .line 378
    iput-object v2, v1, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 379
    .line 380
    iput-object v7, v1, Landroidx/fragment/app/u0;->b:Ljava/util/ArrayList;

    .line 381
    .line 382
    iput-object v8, v1, Landroidx/fragment/app/u0;->c:[Landroidx/fragment/app/b;

    .line 383
    .line 384
    iget-object v2, p0, Landroidx/fragment/app/s0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    iput v2, v1, Landroidx/fragment/app/u0;->d:I

    .line 391
    .line 392
    iget-object v2, p0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 393
    .line 394
    if-eqz v2, :cond_c

    .line 395
    .line 396
    iget-object v2, v2, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 397
    .line 398
    iput-object v2, v1, Landroidx/fragment/app/u0;->e:Ljava/lang/String;

    .line 399
    .line 400
    :cond_c
    iget-object v2, v1, Landroidx/fragment/app/u0;->f:Ljava/util/ArrayList;

    .line 401
    .line 402
    iget-object v3, p0, Landroidx/fragment/app/s0;->j:Ljava/util/Map;

    .line 403
    .line 404
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 409
    .line 410
    .line 411
    iget-object v2, v1, Landroidx/fragment/app/u0;->x:Ljava/util/ArrayList;

    .line 412
    .line 413
    iget-object v3, p0, Landroidx/fragment/app/s0;->j:Ljava/util/Map;

    .line 414
    .line 415
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 420
    .line 421
    .line 422
    new-instance v2, Ljava/util/ArrayList;

    .line 423
    .line 424
    iget-object v3, p0, Landroidx/fragment/app/s0;->C:Ljava/util/ArrayDeque;

    .line 425
    .line 426
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 427
    .line 428
    .line 429
    iput-object v2, v1, Landroidx/fragment/app/u0;->y:Ljava/util/ArrayList;

    .line 430
    .line 431
    const-string v2, "state"

    .line 432
    .line 433
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 434
    .line 435
    .line 436
    iget-object v1, p0, Landroidx/fragment/app/s0;->k:Ljava/util/Map;

    .line 437
    .line 438
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-eqz v2, :cond_d

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, Ljava/lang/String;

    .line 457
    .line 458
    const-string v3, "result_"

    .line 459
    .line 460
    invoke-static {v3, v2}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    iget-object v4, p0, Landroidx/fragment/app/s0;->k:Ljava/util/Map;

    .line 465
    .line 466
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, Landroid/os/Bundle;

    .line 471
    .line 472
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 473
    .line 474
    .line 475
    goto :goto_6

    .line 476
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-eqz v2, :cond_e

    .line 485
    .line 486
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    check-cast v2, Landroidx/fragment/app/y0;

    .line 491
    .line 492
    new-instance v3, Landroid/os/Bundle;

    .line 493
    .line 494
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 495
    .line 496
    .line 497
    const-string v4, "state"

    .line 498
    .line 499
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 500
    .line 501
    .line 502
    new-instance v4, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    const-string v5, "fragment_"

    .line 505
    .line 506
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v2, v2, Landroidx/fragment/app/y0;->b:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 519
    .line 520
    .line 521
    goto :goto_7

    .line 522
    :cond_e
    :goto_8
    return-object v0

    .line 523
    :catchall_0
    move-exception v0

    .line 524
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 525
    throw v0
.end method

.method public final U()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 18
    .line 19
    iget-object v1, v1, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/fragment/app/s0;->M:Landroidx/fragment/app/e;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/fragment/app/s0;->M:Landroidx/fragment/app/e;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->b0()V

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v1
.end method

.method public final V(Landroidx/fragment/app/y;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->D(Landroidx/fragment/app/y;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final W(Landroidx/fragment/app/y;Landroidx/lifecycle/o;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->A(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroidx/fragment/app/y;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 18
    .line 19
    if-ne v0, p0, :cond_1

    .line 20
    .line 21
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/y;->c0:Landroidx/lifecycle/o;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "Fragment "

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " is not an active fragment of FragmentManager "

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p2
.end method

.method public final X(Landroidx/fragment/app/y;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->A(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/y;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 20
    .line 21
    if-ne v0, p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "Fragment "

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " is not an active fragment of FragmentManager "

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 53
    .line 54
    iput-object p1, p0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->q(Landroidx/fragment/app/y;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->q(Landroidx/fragment/app/y;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final Y(Landroidx/fragment/app/y;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->D(Landroidx/fragment/app/y;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, Landroidx/fragment/app/v;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, Landroidx/fragment/app/v;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, Landroidx/fragment/app/v;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, Landroidx/fragment/app/v;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f0a020c

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/fragment/app/y;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/v;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Landroidx/fragment/app/v;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final a(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/y;->b0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lv0/c;->d(Landroidx/fragment/app/y;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Li/g;->G(Landroidx/fragment/app/z0;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Landroidx/fragment/app/y;->Q:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Li/g;->h(Landroidx/fragment/app/y;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Landroidx/fragment/app/y;->C:Z

    .line 54
    .line 55
    iget-object v2, p1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iput-boolean v1, p1, Landroidx/fragment/app/y;->Z:Z

    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 69
    .line 70
    :cond_3
    return-object v0
.end method

.method public final a0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->v()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/z0;

    .line 22
    .line 23
    iget-object v2, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 24
    .line 25
    iget-boolean v3, v2, Landroidx/fragment/app/y;->W:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Landroidx/fragment/app/s0;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->H:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Landroidx/fragment/app/y;->W:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/z0;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final b(Landroidx/fragment/app/a0;Lcom/bumptech/glide/c;Landroidx/fragment/app/y;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/s0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/n0;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Landroidx/fragment/app/n0;-><init>(Landroidx/fragment/app/y;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/x0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 32
    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->b0()V

    .line 36
    .line 37
    .line 38
    :cond_2
    instance-of p2, p1, Landroidx/activity/s;

    .line 39
    .line 40
    if-eqz p2, :cond_5

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/a0;->t0()Landroidx/activity/r;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iput-object p2, p0, Landroidx/fragment/app/s0;->g:Landroidx/activity/r;

    .line 47
    .line 48
    if-eqz p3, :cond_3

    .line 49
    .line 50
    move-object v0, p3

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v0, p1

    .line 53
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Landroidx/lifecycle/u;->getLifecycle()Landroidx/lifecycle/p;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v1, v0

    .line 61
    check-cast v1, Landroidx/lifecycle/w;

    .line 62
    .line 63
    iget-object v1, v1, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 64
    .line 65
    sget-object v2, Landroidx/lifecycle/o;->a:Landroidx/lifecycle/o;

    .line 66
    .line 67
    if-ne v1, v2, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    new-instance v1, Landroidx/activity/p;

    .line 71
    .line 72
    iget-object v2, p0, Landroidx/fragment/app/s0;->h:Landroidx/fragment/app/k0;

    .line 73
    .line 74
    invoke-direct {v1, p2, v0, v2}, Landroidx/activity/p;-><init>(Landroidx/activity/r;Landroidx/lifecycle/p;Landroidx/fragment/app/k0;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v2, Landroidx/fragment/app/k0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {p2}, Landroidx/activity/r;->b()V

    .line 89
    .line 90
    .line 91
    iget-object p2, p2, Landroidx/activity/r;->c:Landroidx/fragment/app/z;

    .line 92
    .line 93
    iput-object p2, v2, Landroidx/fragment/app/k0;->c:Lf0/a;

    .line 94
    .line 95
    :cond_5
    :goto_2
    const/4 p2, 0x0

    .line 96
    if-eqz p3, :cond_7

    .line 97
    .line 98
    iget-object p1, p3, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 99
    .line 100
    iget-object p1, p1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 101
    .line 102
    iget-object v0, p1, Landroidx/fragment/app/w0;->b:Ljava/util/HashMap;

    .line 103
    .line 104
    iget-object v1, p3, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Landroidx/fragment/app/w0;

    .line 111
    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    new-instance v1, Landroidx/fragment/app/w0;

    .line 115
    .line 116
    iget-boolean p1, p1, Landroidx/fragment/app/w0;->d:Z

    .line 117
    .line 118
    invoke-direct {v1, p1}, Landroidx/fragment/app/w0;-><init>(Z)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p3, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    iput-object v1, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    instance-of v0, p1, Landroidx/lifecycle/c1;

    .line 130
    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    invoke-virtual {p1}, Landroidx/fragment/app/a0;->getViewModelStore()Landroidx/lifecycle/b1;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance v0, Landroidx/lifecycle/a1;

    .line 138
    .line 139
    sget-object v1, Landroidx/fragment/app/w0;->g:Landroidx/fragment/app/v0;

    .line 140
    .line 141
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/fragment/app/v0;)V

    .line 142
    .line 143
    .line 144
    const-class p1, Landroidx/fragment/app/w0;

    .line 145
    .line 146
    invoke-virtual {v0, p1}, Landroidx/lifecycle/a1;->a(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Landroidx/fragment/app/w0;

    .line 151
    .line 152
    iput-object p1, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    new-instance p1, Landroidx/fragment/app/w0;

    .line 156
    .line 157
    invoke-direct {p1, p2}, Landroidx/fragment/app/w0;-><init>(Z)V

    .line 158
    .line 159
    .line 160
    iput-object p1, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 161
    .line 162
    :goto_3
    iget-object p1, p0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 163
    .line 164
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->E:Z

    .line 165
    .line 166
    if-nez v0, :cond_a

    .line 167
    .line 168
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->F:Z

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    move v0, p2

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    :goto_4
    const/4 v0, 0x1

    .line 176
    :goto_5
    iput-boolean v0, p1, Landroidx/fragment/app/w0;->f:Z

    .line 177
    .line 178
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 179
    .line 180
    iput-object p1, v0, Li/g;->e:Ljava/lang/Object;

    .line 181
    .line 182
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 183
    .line 184
    instance-of v0, p1, Ln3/g;

    .line 185
    .line 186
    const/4 v1, 0x2

    .line 187
    if-eqz v0, :cond_b

    .line 188
    .line 189
    if-nez p3, :cond_b

    .line 190
    .line 191
    invoke-virtual {p1}, Landroidx/fragment/app/a0;->getSavedStateRegistry()Ln3/e;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v0, Landroidx/activity/c;

    .line 196
    .line 197
    invoke-direct {v0, p0, v1}, Landroidx/activity/c;-><init>(Ljava/lang/Object;I)V

    .line 198
    .line 199
    .line 200
    const-string v2, "android:support:fragments"

    .line 201
    .line 202
    invoke-virtual {p1, v2, v0}, Ln3/e;->c(Ljava/lang/String;Ln3/d;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v2}, Ln3/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-eqz p1, :cond_b

    .line 210
    .line 211
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->S(Landroid/os/Parcelable;)V

    .line 212
    .line 213
    .line 214
    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 215
    .line 216
    instance-of v0, p1, Lc/i;

    .line 217
    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    iget-object p1, p1, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 221
    .line 222
    invoke-virtual {p1}, Landroidx/activity/j;->getActivityResultRegistry()Lc/h;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-eqz p3, :cond_c

    .line 227
    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    iget-object v2, p3, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 234
    .line 235
    const-string v3, ":"

    .line 236
    .line 237
    invoke-static {v0, v2, v3}, La3/g;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    goto :goto_6

    .line 242
    :cond_c
    const-string v0, ""

    .line 243
    .line 244
    :goto_6
    const-string v2, "FragmentManager:"

    .line 245
    .line 246
    invoke-static {v2, v0}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const-string v2, "StartActivityForResult"

    .line 251
    .line 252
    invoke-static {v0, v2}, La3/g;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    new-instance v3, Ld/c;

    .line 257
    .line 258
    invoke-direct {v3}, Ld/c;-><init>()V

    .line 259
    .line 260
    .line 261
    new-instance v4, Landroidx/fragment/app/j0;

    .line 262
    .line 263
    invoke-direct {v4, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v2, v3, v4}, Lc/h;->d(Ljava/lang/String;Ld/a;Landroidx/fragment/app/j0;)Lc/e;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    iput-object v1, p0, Landroidx/fragment/app/s0;->z:Lc/e;

    .line 271
    .line 272
    const-string v1, "StartIntentSenderForResult"

    .line 273
    .line 274
    invoke-static {v0, v1}, La3/g;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    new-instance v2, Landroidx/fragment/app/o0;

    .line 279
    .line 280
    invoke-direct {v2}, Landroidx/fragment/app/o0;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v3, Landroidx/fragment/app/j0;

    .line 284
    .line 285
    const/4 v4, 0x3

    .line 286
    invoke-direct {v3, p0, v4}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v1, v2, v3}, Lc/h;->d(Ljava/lang/String;Ld/a;Landroidx/fragment/app/j0;)Lc/e;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iput-object v1, p0, Landroidx/fragment/app/s0;->A:Lc/e;

    .line 294
    .line 295
    const-string v1, "RequestPermissions"

    .line 296
    .line 297
    invoke-static {v0, v1}, La3/g;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    new-instance v1, Ld/b;

    .line 302
    .line 303
    invoke-direct {v1}, Ld/b;-><init>()V

    .line 304
    .line 305
    .line 306
    new-instance v2, Landroidx/fragment/app/j0;

    .line 307
    .line 308
    invoke-direct {v2, p0, p2}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/s0;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, v0, v1, v2}, Lc/h;->d(Ljava/lang/String;Ld/a;Landroidx/fragment/app/j0;)Lc/e;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    iput-object p1, p0, Landroidx/fragment/app/s0;->B:Lc/e;

    .line 316
    .line 317
    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 318
    .line 319
    instance-of p2, p1, Lx/n;

    .line 320
    .line 321
    if-eqz p2, :cond_e

    .line 322
    .line 323
    iget-object p2, p0, Landroidx/fragment/app/s0;->n:Landroidx/fragment/app/i0;

    .line 324
    .line 325
    invoke-virtual {p1, p2}, Landroidx/fragment/app/a0;->p0(Lf0/a;)V

    .line 326
    .line 327
    .line 328
    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 329
    .line 330
    instance-of p2, p1, Lx/o;

    .line 331
    .line 332
    if-eqz p2, :cond_f

    .line 333
    .line 334
    iget-object p2, p0, Landroidx/fragment/app/s0;->o:Landroidx/fragment/app/i0;

    .line 335
    .line 336
    invoke-virtual {p1, p2}, Landroidx/fragment/app/a0;->s0(Lf0/a;)V

    .line 337
    .line 338
    .line 339
    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 340
    .line 341
    instance-of p2, p1, Lw/v;

    .line 342
    .line 343
    if-eqz p2, :cond_10

    .line 344
    .line 345
    iget-object p2, p0, Landroidx/fragment/app/s0;->p:Landroidx/fragment/app/i0;

    .line 346
    .line 347
    invoke-virtual {p1, p2}, Landroidx/fragment/app/a0;->q0(Lf0/a;)V

    .line 348
    .line 349
    .line 350
    :cond_10
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 351
    .line 352
    instance-of p2, p1, Lw/w;

    .line 353
    .line 354
    if-eqz p2, :cond_11

    .line 355
    .line 356
    iget-object p2, p0, Landroidx/fragment/app/s0;->q:Landroidx/fragment/app/i0;

    .line 357
    .line 358
    invoke-virtual {p1, p2}, Landroidx/fragment/app/a0;->r0(Lf0/a;)V

    .line 359
    .line 360
    .line 361
    :cond_11
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 362
    .line 363
    instance-of p2, p1, Lg0/n;

    .line 364
    .line 365
    if-eqz p2, :cond_12

    .line 366
    .line 367
    if-nez p3, :cond_12

    .line 368
    .line 369
    iget-object p2, p0, Landroidx/fragment/app/s0;->r:Landroidx/fragment/app/l0;

    .line 370
    .line 371
    invoke-virtual {p1, p2}, Landroidx/fragment/app/a0;->o0(Lg0/t;)V

    .line 372
    .line 373
    .line 374
    :cond_12
    return-void

    .line 375
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 376
    .line 377
    const-string p2, "Already attached"

    .line 378
    .line 379
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw p1
.end method

.method public final b0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/s0;->h:Landroidx/fragment/app/k0;

    .line 14
    .line 15
    iput-boolean v2, v1, Landroidx/fragment/app/k0;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/fragment/app/k0;->c:Lf0/a;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Lf0/a;->accept(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Landroidx/fragment/app/s0;->h:Landroidx/fragment/app/k0;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v1, v3

    .line 45
    :goto_1
    if-lez v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 48
    .line 49
    invoke-static {v1}, Landroidx/fragment/app/s0;->K(Landroidx/fragment/app/y;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move v2, v3

    .line 57
    :goto_2
    iput-boolean v2, v0, Landroidx/fragment/app/k0;->a:Z

    .line 58
    .line 59
    iget-object v0, v0, Landroidx/fragment/app/k0;->c:Lf0/a;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Lf0/a;->accept(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    return-void

    .line 71
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v1
.end method

.method public final c(Landroidx/fragment/app/y;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/y;->Q:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/y;->Q:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/y;->B:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Li/g;->h(Landroidx/fragment/app/y;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 7
    .line 8
    invoke-virtual {v1}, Li/g;->v()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/z0;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 4
    .line 5
    iget-object v2, v1, Li/g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/z0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/z0;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/s0;->l:Landroidx/fragment/app/h0;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/h0;Li/g;Landroidx/fragment/app/y;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/z0;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Landroidx/fragment/app/s0;->s:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/z0;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/y;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/y;->Q:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/y;->Q:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Landroidx/fragment/app/y;->B:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 62
    .line 63
    iget-object v2, v0, Li/g;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_0
    iget-object v0, v0, Li/g;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Landroidx/fragment/app/y;->B:Z

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->Y(Landroidx/fragment/app/y;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/y;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/fragment/app/y;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->h(Landroid/content/res/Configuration;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/y;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/fragment/app/y;->K()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    return v1
.end method

.method public final j()Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/y;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Landroidx/fragment/app/s0;->J(Landroidx/fragment/app/y;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Landroidx/fragment/app/y;->P:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/fragment/app/s0;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    or-int/2addr v6, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v6, v1

    .line 53
    :goto_1
    if-eqz v6, :cond_1

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    new-instance v3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move v4, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ge v1, v0, :cond_7

    .line 78
    .line 79
    iget-object v0, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroidx/fragment/app/y;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_6

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    iput-object v3, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 102
    .line 103
    return v4
.end method

.method public final k()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/n1;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/fragment/app/n1;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 32
    .line 33
    instance-of v2, v1, Landroidx/lifecycle/c1;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object v0, v3, Li/g;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroidx/fragment/app/w0;

    .line 42
    .line 43
    iget-boolean v0, v0, Landroidx/fragment/app/w0;->e:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 47
    .line 48
    instance-of v2, v1, Landroid/app/Activity;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    check-cast v1, Landroid/app/Activity;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    xor-int/2addr v0, v1

    .line 59
    :cond_2
    :goto_1
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Landroidx/fragment/app/s0;->j:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Landroidx/fragment/app/c;

    .line 82
    .line 83
    iget-object v1, v1, Landroidx/fragment/app/c;->a:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v4, v3, Li/g;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Landroidx/fragment/app/w0;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/4 v5, 0x3

    .line 109
    invoke-static {v5}, Landroidx/fragment/app/s0;->H(I)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    new-instance v5, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v6, "Clearing non-config state for saved state of Fragment "

    .line 118
    .line 119
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-string v6, "FragmentManager"

    .line 130
    .line 131
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-virtual {v4, v2}, Landroidx/fragment/app/w0;->c(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const/4 v0, -0x1

    .line 139
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 143
    .line 144
    instance-of v1, v0, Lx/o;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    iget-object v1, p0, Landroidx/fragment/app/s0;->o:Landroidx/fragment/app/i0;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroidx/fragment/app/a0;->y0(Lf0/a;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 154
    .line 155
    instance-of v1, v0, Lx/n;

    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    iget-object v1, p0, Landroidx/fragment/app/s0;->n:Landroidx/fragment/app/i0;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroidx/fragment/app/a0;->v0(Lf0/a;)V

    .line 162
    .line 163
    .line 164
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 165
    .line 166
    instance-of v1, v0, Lw/v;

    .line 167
    .line 168
    if-eqz v1, :cond_8

    .line 169
    .line 170
    iget-object v1, p0, Landroidx/fragment/app/s0;->p:Landroidx/fragment/app/i0;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Landroidx/fragment/app/a0;->w0(Lf0/a;)V

    .line 173
    .line 174
    .line 175
    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 176
    .line 177
    instance-of v1, v0, Lw/w;

    .line 178
    .line 179
    if-eqz v1, :cond_9

    .line 180
    .line 181
    iget-object v1, p0, Landroidx/fragment/app/s0;->q:Landroidx/fragment/app/i0;

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Landroidx/fragment/app/a0;->x0(Lf0/a;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 187
    .line 188
    instance-of v1, v0, Lg0/n;

    .line 189
    .line 190
    if-eqz v1, :cond_a

    .line 191
    .line 192
    iget-object v1, p0, Landroidx/fragment/app/s0;->r:Landroidx/fragment/app/l0;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Landroidx/fragment/app/a0;->u0(Lg0/t;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    const/4 v0, 0x0

    .line 198
    iput-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 199
    .line 200
    iput-object v0, p0, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 201
    .line 202
    iput-object v0, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 203
    .line 204
    iget-object v1, p0, Landroidx/fragment/app/s0;->g:Landroidx/activity/r;

    .line 205
    .line 206
    if-eqz v1, :cond_c

    .line 207
    .line 208
    iget-object v1, p0, Landroidx/fragment/app/s0;->h:Landroidx/fragment/app/k0;

    .line 209
    .line 210
    iget-object v1, v1, Landroidx/fragment/app/k0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_b

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Landroidx/activity/a;

    .line 227
    .line 228
    invoke-interface {v2}, Landroidx/activity/a;->cancel()V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_b
    iput-object v0, p0, Landroidx/fragment/app/s0;->g:Landroidx/activity/r;

    .line 233
    .line 234
    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/s0;->z:Lc/e;

    .line 235
    .line 236
    if-eqz v0, :cond_d

    .line 237
    .line 238
    invoke-virtual {v0}, Lc/e;->b()V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Landroidx/fragment/app/s0;->A:Lc/e;

    .line 242
    .line 243
    invoke-virtual {v0}, Lc/e;->b()V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Landroidx/fragment/app/s0;->B:Lc/e;

    .line 247
    .line 248
    invoke-virtual {v0}, Lc/e;->b()V

    .line 249
    .line 250
    .line 251
    :cond_d
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/y;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/y;->onLowMemory()V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->l()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/y;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->m(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->z()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/y;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/y;->r()Z

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->n()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/y;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/y;->P:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/s0;->o()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public final p()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/fragment/app/y;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Landroidx/fragment/app/y;->P:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->p()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public final q(Landroidx/fragment/app/y;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->A(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/y;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/fragment/app/s0;->K(Landroidx/fragment/app/y;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p1, Landroidx/fragment/app/y;->A:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eq v1, v0, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p1, Landroidx/fragment/app/y;->A:Ljava/lang/Boolean;

    .line 39
    .line 40
    iget-object p1, p1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/s0;->b0()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/fragment/app/s0;->q(Landroidx/fragment/app/y;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/y;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroidx/fragment/app/s0;->r(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public final s()Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/s0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/g;->C()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/fragment/app/y;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Landroidx/fragment/app/s0;->J(Landroidx/fragment/app/y;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, Landroidx/fragment/app/y;->P:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/fragment/app/s0;->s()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    or-int/2addr v4, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v4, v1

    .line 52
    :goto_1
    if-eqz v4, :cond_1

    .line 53
    .line 54
    move v3, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return v3
.end method

.method public final t(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 6
    .line 7
    iget-object v2, v2, Li/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/z0;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/z0;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/s0;->L(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/fragment/app/n1;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/n1;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->b:Z

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    iput-boolean v1, p0, Landroidx/fragment/app/s0;->b:Z

    .line 71
    .line 72
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, La3/g;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2, p3, p4}, Li/g;->p(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 p4, 0x0

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-lez p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "Fragments Created Menus:"

    .line 27
    .line 28
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move v1, p4

    .line 32
    :goto_0
    if-ge v1, p2, :cond_0

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/fragment/app/s0;->e:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroidx/fragment/app/y;

    .line 41
    .line 42
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "  #"

    .line 46
    .line 47
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 51
    .line 52
    .line 53
    const-string v3, ": "

    .line 54
    .line 55
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/fragment/app/y;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-eqz p2, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-lez p2, :cond_1

    .line 77
    .line 78
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, "Back Stack:"

    .line 82
    .line 83
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    move v1, p4

    .line 87
    :goto_1
    if-ge v1, p2, :cond_1

    .line 88
    .line 89
    iget-object v2, p0, Landroidx/fragment/app/s0;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroidx/fragment/app/a;

    .line 96
    .line 97
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v3, "  #"

    .line 101
    .line 102
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 106
    .line 107
    .line 108
    const-string v3, ": "

    .line 109
    .line 110
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance p2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v0, "Back Stack Index: "

    .line 133
    .line 134
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Landroidx/fragment/app/s0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 154
    .line 155
    monitor-enter p2

    .line 156
    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-lez v0, :cond_2

    .line 163
    .line 164
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string v1, "Pending Actions:"

    .line 168
    .line 169
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :goto_2
    if-ge p4, v0, :cond_2

    .line 173
    .line 174
    iget-object v1, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Landroidx/fragment/app/q0;

    .line 181
    .line 182
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v2, "  #"

    .line 186
    .line 187
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 191
    .line 192
    .line 193
    const-string v2, ": "

    .line 194
    .line 195
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 p4, p4, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string p2, "FragmentManager misc state:"

    .line 209
    .line 210
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string p2, "  mHost="

    .line 217
    .line 218
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object p2, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 222
    .line 223
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string p2, "  mContainer="

    .line 230
    .line 231
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object p2, p0, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 235
    .line 236
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object p2, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 240
    .line 241
    if-eqz p2, :cond_3

    .line 242
    .line 243
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const-string p2, "  mParent="

    .line 247
    .line 248
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object p2, p0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 252
    .line 253
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_3
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string p2, "  mCurState="

    .line 260
    .line 261
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget p2, p0, Landroidx/fragment/app/s0;->s:I

    .line 265
    .line 266
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 267
    .line 268
    .line 269
    const-string p2, " mStateSaved="

    .line 270
    .line 271
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget-boolean p2, p0, Landroidx/fragment/app/s0;->E:Z

    .line 275
    .line 276
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 277
    .line 278
    .line 279
    const-string p2, " mStopped="

    .line 280
    .line 281
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-boolean p2, p0, Landroidx/fragment/app/s0;->F:Z

    .line 285
    .line 286
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 287
    .line 288
    .line 289
    const-string p2, " mDestroyed="

    .line 290
    .line 291
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iget-boolean p2, p0, Landroidx/fragment/app/s0;->G:Z

    .line 295
    .line 296
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 297
    .line 298
    .line 299
    iget-boolean p2, p0, Landroidx/fragment/app/s0;->D:Z

    .line 300
    .line 301
    if-eqz p2, :cond_4

    .line 302
    .line 303
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const-string p1, "  mNeedMenuInvalidate="

    .line 307
    .line 308
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->D:Z

    .line 312
    .line 313
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 314
    .line 315
    .line 316
    :cond_4
    return-void

    .line 317
    :catchall_0
    move-exception p1

    .line 318
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 319
    throw p1
.end method

.method public final v(Landroidx/fragment/app/q0;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_5

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->G:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->E:Z

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->F:Z

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 39
    :goto_1
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_5
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 54
    .line 55
    if-nez v1, :cond_7

    .line 56
    .line 57
    if-eqz p2, :cond_6

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "Activity has been destroyed"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_7
    iget-object p2, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->U()V

    .line 75
    .line 76
    .line 77
    monitor-exit v0

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p1
.end method

.method public final w(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->G:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_7

    .line 42
    .line 43
    if-nez p1, :cond_5

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->E:Z

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->F:Z

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 57
    :goto_1
    if-nez p1, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_5
    :goto_2
    iget-object p1, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 78
    .line 79
    new-instance p1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 85
    .line 86
    :cond_6
    return-void

    .line 87
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v0, "Must be called from main thread of fragment host"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v0, "FragmentManager is already executing transactions"

    .line 98
    .line 99
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public final x(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/s0;->w(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    move v5, p1

    .line 31
    move v6, v5

    .line 32
    :goto_1
    if-ge v5, v4, :cond_1

    .line 33
    .line 34
    iget-object v7, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Landroidx/fragment/app/q0;

    .line 41
    .line 42
    invoke-interface {v7, v1, v2}, Landroidx/fragment/app/q0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 43
    .line 44
    .line 45
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    or-int/2addr v6, v7

    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :try_start_2
    iget-object v1, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/fragment/app/s0;->M:Landroidx/fragment/app/e;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 65
    :goto_2
    if-eqz v6, :cond_2

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Landroidx/fragment/app/s0;->b:Z

    .line 69
    .line 70
    :try_start_3
    iget-object v1, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v2, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/s0;->R(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->b0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Landroidx/fragment/app/s0;->H:Z

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iput-boolean p1, p0, Landroidx/fragment/app/s0;->H:Z

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->a0()V

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 99
    .line 100
    invoke-virtual {p1}, Li/g;->m()V

    .line 101
    .line 102
    .line 103
    return v0

    .line 104
    :catchall_1
    move-exception p1

    .line 105
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/s0;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 111
    .line 112
    iget-object v0, v0, Landroidx/fragment/app/a0;->E:Landroid/os/Handler;

    .line 113
    .line 114
    iget-object v1, p0, Landroidx/fragment/app/s0;->M:Landroidx/fragment/app/e;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :catchall_2
    move-exception p1

    .line 121
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 122
    throw p1
.end method

.method public final y(Landroidx/fragment/app/q0;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/s0;->G:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/s0;->w(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {p1, p2, v0}, Landroidx/fragment/app/q0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/fragment/app/s0;->b:Z

    .line 27
    .line 28
    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/s0;->I:Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/fragment/app/s0;->J:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/s0;->R(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->d()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->b0()V

    .line 45
    .line 46
    .line 47
    iget-boolean p1, p0, Landroidx/fragment/app/s0;->H:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Landroidx/fragment/app/s0;->H:Z

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/fragment/app/s0;->a0()V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 58
    .line 59
    invoke-virtual {p1}, Li/g;->m()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Landroidx/fragment/app/a;

    .line 16
    .line 17
    iget-boolean v5, v5, Landroidx/fragment/app/a;->o:Z

    .line 18
    .line 19
    iget-object v6, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    new-instance v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v6, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/fragment/app/s0;->c:Li/g;

    .line 37
    .line 38
    invoke-virtual {v7}, Li/g;->C()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Landroidx/fragment/app/s0;->w:Landroidx/fragment/app/y;

    .line 46
    .line 47
    move v9, v3

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v13, 0x1

    .line 50
    if-ge v9, v4, :cond_13

    .line 51
    .line 52
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v14

    .line 56
    check-cast v14, Landroidx/fragment/app/a;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    check-cast v15, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-nez v15, :cond_d

    .line 69
    .line 70
    iget-object v15, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    :goto_2
    iget-object v8, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ge v12, v11, :cond_c

    .line 80
    .line 81
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Landroidx/fragment/app/a1;

    .line 86
    .line 87
    iget v3, v11, Landroidx/fragment/app/a1;->a:I

    .line 88
    .line 89
    if-eq v3, v13, :cond_b

    .line 90
    .line 91
    const/4 v13, 0x2

    .line 92
    const/16 v2, 0x9

    .line 93
    .line 94
    if-eq v3, v13, :cond_5

    .line 95
    .line 96
    const/4 v13, 0x3

    .line 97
    if-eq v3, v13, :cond_3

    .line 98
    .line 99
    const/4 v13, 0x6

    .line 100
    if-eq v3, v13, :cond_3

    .line 101
    .line 102
    const/4 v13, 0x7

    .line 103
    if-eq v3, v13, :cond_2

    .line 104
    .line 105
    const/16 v13, 0x8

    .line 106
    .line 107
    if-eq v3, v13, :cond_1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_1
    new-instance v3, Landroidx/fragment/app/a1;

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    invoke-direct {v3, v2, v6, v13}, Landroidx/fragment/app/a1;-><init>(ILandroidx/fragment/app/y;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v12, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/4 v2, 0x1

    .line 120
    iput-boolean v2, v11, Landroidx/fragment/app/a1;->c:Z

    .line 121
    .line 122
    add-int/lit8 v12, v12, 0x1

    .line 123
    .line 124
    iget-object v6, v11, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_2
    move-object/from16 v20, v7

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    iget-object v3, v11, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 133
    .line 134
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    iget-object v3, v11, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 138
    .line 139
    if-ne v3, v6, :cond_4

    .line 140
    .line 141
    new-instance v6, Landroidx/fragment/app/a1;

    .line 142
    .line 143
    invoke-direct {v6, v2, v3}, Landroidx/fragment/app/a1;-><init>(ILandroidx/fragment/app/y;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v12, v12, 0x1

    .line 150
    .line 151
    move-object/from16 v20, v7

    .line 152
    .line 153
    const/4 v1, 0x1

    .line 154
    const/4 v6, 0x0

    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :cond_4
    :goto_3
    move-object/from16 v20, v7

    .line 158
    .line 159
    const/4 v1, 0x1

    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :cond_5
    iget-object v3, v11, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 163
    .line 164
    iget v13, v3, Landroidx/fragment/app/y;->N:I

    .line 165
    .line 166
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v17

    .line 170
    const/16 v16, -0x1

    .line 171
    .line 172
    add-int/lit8 v17, v17, -0x1

    .line 173
    .line 174
    move/from16 v2, v17

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    :goto_4
    if-ltz v2, :cond_9

    .line 179
    .line 180
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v19

    .line 184
    move-object/from16 v20, v7

    .line 185
    .line 186
    move-object/from16 v7, v19

    .line 187
    .line 188
    check-cast v7, Landroidx/fragment/app/y;

    .line 189
    .line 190
    iget v1, v7, Landroidx/fragment/app/y;->N:I

    .line 191
    .line 192
    if-ne v1, v13, :cond_8

    .line 193
    .line 194
    if-ne v7, v3, :cond_6

    .line 195
    .line 196
    move/from16 v18, v13

    .line 197
    .line 198
    const/4 v1, 0x1

    .line 199
    const/16 v17, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_6
    if-ne v7, v6, :cond_7

    .line 203
    .line 204
    new-instance v1, Landroidx/fragment/app/a1;

    .line 205
    .line 206
    move/from16 v18, v13

    .line 207
    .line 208
    const/16 v6, 0x9

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    invoke-direct {v1, v6, v7, v13}, Landroidx/fragment/app/a1;-><init>(ILandroidx/fragment/app/y;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v12, v12, 0x1

    .line 218
    .line 219
    const/4 v6, 0x0

    .line 220
    goto :goto_5

    .line 221
    :cond_7
    move/from16 v18, v13

    .line 222
    .line 223
    const/16 v1, 0x9

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    :goto_5
    new-instance v1, Landroidx/fragment/app/a1;

    .line 227
    .line 228
    move-object/from16 v21, v6

    .line 229
    .line 230
    const/4 v6, 0x3

    .line 231
    invoke-direct {v1, v6, v7, v13}, Landroidx/fragment/app/a1;-><init>(ILandroidx/fragment/app/y;I)V

    .line 232
    .line 233
    .line 234
    iget v6, v11, Landroidx/fragment/app/a1;->d:I

    .line 235
    .line 236
    iput v6, v1, Landroidx/fragment/app/a1;->d:I

    .line 237
    .line 238
    iget v6, v11, Landroidx/fragment/app/a1;->f:I

    .line 239
    .line 240
    iput v6, v1, Landroidx/fragment/app/a1;->f:I

    .line 241
    .line 242
    iget v6, v11, Landroidx/fragment/app/a1;->e:I

    .line 243
    .line 244
    iput v6, v1, Landroidx/fragment/app/a1;->e:I

    .line 245
    .line 246
    iget v6, v11, Landroidx/fragment/app/a1;->g:I

    .line 247
    .line 248
    iput v6, v1, Landroidx/fragment/app/a1;->g:I

    .line 249
    .line 250
    invoke-virtual {v8, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    const/4 v1, 0x1

    .line 257
    add-int/2addr v12, v1

    .line 258
    move-object/from16 v6, v21

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_8
    move/from16 v18, v13

    .line 262
    .line 263
    const/4 v1, 0x1

    .line 264
    :goto_6
    add-int/lit8 v2, v2, -0x1

    .line 265
    .line 266
    move-object/from16 v1, p1

    .line 267
    .line 268
    move/from16 v13, v18

    .line 269
    .line 270
    move-object/from16 v7, v20

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_9
    move-object/from16 v20, v7

    .line 274
    .line 275
    const/4 v1, 0x1

    .line 276
    if-eqz v17, :cond_a

    .line 277
    .line 278
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    add-int/lit8 v12, v12, -0x1

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_a
    iput v1, v11, Landroidx/fragment/app/a1;->a:I

    .line 285
    .line 286
    iput-boolean v1, v11, Landroidx/fragment/app/a1;->c:Z

    .line 287
    .line 288
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_b
    move-object/from16 v20, v7

    .line 293
    .line 294
    move v1, v13

    .line 295
    :goto_7
    iget-object v2, v11, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 296
    .line 297
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :goto_8
    add-int/2addr v12, v1

    .line 301
    move-object/from16 v2, p2

    .line 302
    .line 303
    move/from16 v3, p3

    .line 304
    .line 305
    move v13, v1

    .line 306
    move-object/from16 v7, v20

    .line 307
    .line 308
    move-object/from16 v1, p1

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_c
    move-object/from16 v20, v7

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_d
    move-object/from16 v20, v7

    .line 316
    .line 317
    move v1, v13

    .line 318
    iget-object v2, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 319
    .line 320
    iget-object v3, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    sub-int/2addr v7, v1

    .line 327
    :goto_9
    if-ltz v7, :cond_10

    .line 328
    .line 329
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    check-cast v8, Landroidx/fragment/app/a1;

    .line 334
    .line 335
    iget v11, v8, Landroidx/fragment/app/a1;->a:I

    .line 336
    .line 337
    if-eq v11, v1, :cond_f

    .line 338
    .line 339
    const/4 v1, 0x3

    .line 340
    if-eq v11, v1, :cond_e

    .line 341
    .line 342
    packed-switch v11, :pswitch_data_0

    .line 343
    .line 344
    .line 345
    goto :goto_a

    .line 346
    :pswitch_0
    iget-object v11, v8, Landroidx/fragment/app/a1;->h:Landroidx/lifecycle/o;

    .line 347
    .line 348
    iput-object v11, v8, Landroidx/fragment/app/a1;->i:Landroidx/lifecycle/o;

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :pswitch_1
    iget-object v6, v8, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :pswitch_2
    const/4 v6, 0x0

    .line 355
    goto :goto_a

    .line 356
    :cond_e
    :pswitch_3
    iget-object v8, v8, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 357
    .line 358
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_f
    const/4 v1, 0x3

    .line 363
    :pswitch_4
    iget-object v8, v8, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 364
    .line 365
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :goto_a
    add-int/lit8 v7, v7, -0x1

    .line 369
    .line 370
    const/4 v1, 0x1

    .line 371
    goto :goto_9

    .line 372
    :cond_10
    :goto_b
    if-nez v10, :cond_12

    .line 373
    .line 374
    iget-boolean v1, v14, Landroidx/fragment/app/a;->g:Z

    .line 375
    .line 376
    if-eqz v1, :cond_11

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_11
    const/4 v10, 0x0

    .line 380
    goto :goto_d

    .line 381
    :cond_12
    :goto_c
    const/4 v10, 0x1

    .line 382
    :goto_d
    add-int/lit8 v9, v9, 0x1

    .line 383
    .line 384
    move-object/from16 v1, p1

    .line 385
    .line 386
    move-object/from16 v2, p2

    .line 387
    .line 388
    move/from16 v3, p3

    .line 389
    .line 390
    move-object/from16 v7, v20

    .line 391
    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :cond_13
    move-object/from16 v20, v7

    .line 395
    .line 396
    iget-object v1, v0, Landroidx/fragment/app/s0;->K:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 399
    .line 400
    .line 401
    if-nez v5, :cond_16

    .line 402
    .line 403
    iget v1, v0, Landroidx/fragment/app/s0;->s:I

    .line 404
    .line 405
    const/4 v2, 0x1

    .line 406
    if-lt v1, v2, :cond_16

    .line 407
    .line 408
    move/from16 v1, p3

    .line 409
    .line 410
    :goto_e
    if-ge v1, v4, :cond_16

    .line 411
    .line 412
    move-object/from16 v2, p1

    .line 413
    .line 414
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    check-cast v3, Landroidx/fragment/app/a;

    .line 419
    .line 420
    iget-object v3, v3, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    if-eqz v5, :cond_15

    .line 431
    .line 432
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    check-cast v5, Landroidx/fragment/app/a1;

    .line 437
    .line 438
    iget-object v5, v5, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 439
    .line 440
    if-eqz v5, :cond_14

    .line 441
    .line 442
    iget-object v6, v5, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 443
    .line 444
    if-eqz v6, :cond_14

    .line 445
    .line 446
    invoke-virtual {v0, v5}, Landroidx/fragment/app/s0;->f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    move-object/from16 v6, v20

    .line 451
    .line 452
    invoke-virtual {v6, v5}, Li/g;->G(Landroidx/fragment/app/z0;)V

    .line 453
    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_14
    move-object/from16 v6, v20

    .line 457
    .line 458
    :goto_10
    move-object/from16 v20, v6

    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_15
    move-object/from16 v6, v20

    .line 462
    .line 463
    add-int/lit8 v1, v1, 0x1

    .line 464
    .line 465
    goto :goto_e

    .line 466
    :cond_16
    move-object/from16 v2, p1

    .line 467
    .line 468
    move/from16 v1, p3

    .line 469
    .line 470
    :goto_11
    if-ge v1, v4, :cond_22

    .line 471
    .line 472
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    check-cast v3, Landroidx/fragment/app/a;

    .line 477
    .line 478
    move-object/from16 v5, p2

    .line 479
    .line 480
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    check-cast v6, Ljava/lang/Boolean;

    .line 485
    .line 486
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    const-string v7, "Unknown cmd: "

    .line 491
    .line 492
    if-eqz v6, :cond_1d

    .line 493
    .line 494
    const/4 v6, -0x1

    .line 495
    invoke-virtual {v3, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 496
    .line 497
    .line 498
    iget-object v6, v3, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 499
    .line 500
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    const/4 v9, 0x1

    .line 505
    sub-int/2addr v8, v9

    .line 506
    :goto_12
    if-ltz v8, :cond_21

    .line 507
    .line 508
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    check-cast v9, Landroidx/fragment/app/a1;

    .line 513
    .line 514
    iget-object v10, v9, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 515
    .line 516
    if-eqz v10, :cond_1c

    .line 517
    .line 518
    iget-object v11, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 519
    .line 520
    if-nez v11, :cond_17

    .line 521
    .line 522
    goto :goto_13

    .line 523
    :cond_17
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 524
    .line 525
    .line 526
    move-result-object v11

    .line 527
    const/4 v12, 0x1

    .line 528
    iput-boolean v12, v11, Landroidx/fragment/app/v;->a:Z

    .line 529
    .line 530
    :goto_13
    iget v11, v3, Landroidx/fragment/app/a;->f:I

    .line 531
    .line 532
    const/16 v12, 0x2002

    .line 533
    .line 534
    const/16 v13, 0x1001

    .line 535
    .line 536
    if-eq v11, v13, :cond_1a

    .line 537
    .line 538
    if-eq v11, v12, :cond_19

    .line 539
    .line 540
    const/16 v12, 0x2005

    .line 541
    .line 542
    const/16 v13, 0x1004

    .line 543
    .line 544
    if-eq v11, v12, :cond_19

    .line 545
    .line 546
    const/16 v14, 0x1003

    .line 547
    .line 548
    if-eq v11, v14, :cond_18

    .line 549
    .line 550
    if-eq v11, v13, :cond_1a

    .line 551
    .line 552
    const/4 v12, 0x0

    .line 553
    goto :goto_14

    .line 554
    :cond_18
    move v12, v14

    .line 555
    goto :goto_14

    .line 556
    :cond_19
    move v12, v13

    .line 557
    :cond_1a
    :goto_14
    iget-object v11, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 558
    .line 559
    if-nez v11, :cond_1b

    .line 560
    .line 561
    if-nez v12, :cond_1b

    .line 562
    .line 563
    goto :goto_15

    .line 564
    :cond_1b
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 565
    .line 566
    .line 567
    iget-object v11, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 568
    .line 569
    iput v12, v11, Landroidx/fragment/app/v;->f:I

    .line 570
    .line 571
    :goto_15
    iget-object v11, v3, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 572
    .line 573
    iget-object v12, v3, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    .line 574
    .line 575
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 576
    .line 577
    .line 578
    iget-object v13, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 579
    .line 580
    iput-object v11, v13, Landroidx/fragment/app/v;->g:Ljava/util/ArrayList;

    .line 581
    .line 582
    iput-object v12, v13, Landroidx/fragment/app/v;->h:Ljava/util/ArrayList;

    .line 583
    .line 584
    :cond_1c
    iget v11, v9, Landroidx/fragment/app/a1;->a:I

    .line 585
    .line 586
    iget-object v12, v3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/s0;

    .line 587
    .line 588
    packed-switch v11, :pswitch_data_1

    .line 589
    .line 590
    .line 591
    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 592
    .line 593
    new-instance v2, Ljava/lang/StringBuilder;

    .line 594
    .line 595
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    iget v3, v9, Landroidx/fragment/app/a1;->a:I

    .line 599
    .line 600
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw v1

    .line 611
    :pswitch_6
    iget-object v9, v9, Landroidx/fragment/app/a1;->h:Landroidx/lifecycle/o;

    .line 612
    .line 613
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->W(Landroidx/fragment/app/y;Landroidx/lifecycle/o;)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_16

    .line 617
    .line 618
    :pswitch_7
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->X(Landroidx/fragment/app/y;)V

    .line 619
    .line 620
    .line 621
    goto :goto_16

    .line 622
    :pswitch_8
    const/4 v9, 0x0

    .line 623
    invoke-virtual {v12, v9}, Landroidx/fragment/app/s0;->X(Landroidx/fragment/app/y;)V

    .line 624
    .line 625
    .line 626
    goto :goto_16

    .line 627
    :pswitch_9
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 628
    .line 629
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 630
    .line 631
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 632
    .line 633
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 634
    .line 635
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 636
    .line 637
    .line 638
    const/4 v9, 0x1

    .line 639
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->g(Landroidx/fragment/app/y;)V

    .line 643
    .line 644
    .line 645
    goto :goto_16

    .line 646
    :pswitch_a
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 647
    .line 648
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 649
    .line 650
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 651
    .line 652
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 653
    .line 654
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->c(Landroidx/fragment/app/y;)V

    .line 658
    .line 659
    .line 660
    goto :goto_16

    .line 661
    :pswitch_b
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 662
    .line 663
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 664
    .line 665
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 666
    .line 667
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 668
    .line 669
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 670
    .line 671
    .line 672
    const/4 v9, 0x1

    .line 673
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->G(Landroidx/fragment/app/y;)V

    .line 677
    .line 678
    .line 679
    goto :goto_16

    .line 680
    :pswitch_c
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 681
    .line 682
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 683
    .line 684
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 685
    .line 686
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 687
    .line 688
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    invoke-static {v10}, Landroidx/fragment/app/s0;->Z(Landroidx/fragment/app/y;)V

    .line 695
    .line 696
    .line 697
    goto :goto_16

    .line 698
    :pswitch_d
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 699
    .line 700
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 701
    .line 702
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 703
    .line 704
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 705
    .line 706
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->a(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 710
    .line 711
    .line 712
    goto :goto_16

    .line 713
    :pswitch_e
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 714
    .line 715
    iget v13, v9, Landroidx/fragment/app/a1;->e:I

    .line 716
    .line 717
    iget v14, v9, Landroidx/fragment/app/a1;->f:I

    .line 718
    .line 719
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 720
    .line 721
    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 722
    .line 723
    .line 724
    const/4 v9, 0x1

    .line 725
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->Q(Landroidx/fragment/app/y;)V

    .line 729
    .line 730
    .line 731
    :goto_16
    add-int/lit8 v8, v8, -0x1

    .line 732
    .line 733
    goto/16 :goto_12

    .line 734
    .line 735
    :cond_1d
    const/4 v6, 0x1

    .line 736
    invoke-virtual {v3, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 737
    .line 738
    .line 739
    iget-object v6, v3, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 740
    .line 741
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 742
    .line 743
    .line 744
    move-result v8

    .line 745
    const/4 v13, 0x0

    .line 746
    :goto_17
    if-ge v13, v8, :cond_21

    .line 747
    .line 748
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    check-cast v9, Landroidx/fragment/app/a1;

    .line 753
    .line 754
    iget-object v10, v9, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 755
    .line 756
    if-eqz v10, :cond_20

    .line 757
    .line 758
    iget-object v11, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 759
    .line 760
    if-nez v11, :cond_1e

    .line 761
    .line 762
    goto :goto_18

    .line 763
    :cond_1e
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 764
    .line 765
    .line 766
    move-result-object v11

    .line 767
    const/4 v12, 0x0

    .line 768
    iput-boolean v12, v11, Landroidx/fragment/app/v;->a:Z

    .line 769
    .line 770
    :goto_18
    iget v11, v3, Landroidx/fragment/app/a;->f:I

    .line 771
    .line 772
    iget-object v12, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 773
    .line 774
    if-nez v12, :cond_1f

    .line 775
    .line 776
    if-nez v11, :cond_1f

    .line 777
    .line 778
    goto :goto_19

    .line 779
    :cond_1f
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 780
    .line 781
    .line 782
    iget-object v12, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 783
    .line 784
    iput v11, v12, Landroidx/fragment/app/v;->f:I

    .line 785
    .line 786
    :goto_19
    iget-object v11, v3, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    .line 787
    .line 788
    iget-object v12, v3, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 789
    .line 790
    invoke-virtual {v10}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 791
    .line 792
    .line 793
    iget-object v14, v10, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 794
    .line 795
    iput-object v11, v14, Landroidx/fragment/app/v;->g:Ljava/util/ArrayList;

    .line 796
    .line 797
    iput-object v12, v14, Landroidx/fragment/app/v;->h:Ljava/util/ArrayList;

    .line 798
    .line 799
    :cond_20
    iget v11, v9, Landroidx/fragment/app/a1;->a:I

    .line 800
    .line 801
    iget-object v12, v3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/s0;

    .line 802
    .line 803
    packed-switch v11, :pswitch_data_2

    .line 804
    .line 805
    .line 806
    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 807
    .line 808
    new-instance v2, Ljava/lang/StringBuilder;

    .line 809
    .line 810
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    iget v3, v9, Landroidx/fragment/app/a1;->a:I

    .line 814
    .line 815
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    throw v1

    .line 826
    :pswitch_10
    iget-object v9, v9, Landroidx/fragment/app/a1;->i:Landroidx/lifecycle/o;

    .line 827
    .line 828
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->W(Landroidx/fragment/app/y;Landroidx/lifecycle/o;)V

    .line 829
    .line 830
    .line 831
    goto :goto_1a

    .line 832
    :pswitch_11
    const/4 v11, 0x0

    .line 833
    invoke-virtual {v12, v11}, Landroidx/fragment/app/s0;->X(Landroidx/fragment/app/y;)V

    .line 834
    .line 835
    .line 836
    goto :goto_1a

    .line 837
    :pswitch_12
    const/4 v11, 0x0

    .line 838
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->X(Landroidx/fragment/app/y;)V

    .line 839
    .line 840
    .line 841
    goto :goto_1a

    .line 842
    :pswitch_13
    const/4 v11, 0x0

    .line 843
    iget v14, v9, Landroidx/fragment/app/a1;->d:I

    .line 844
    .line 845
    iget v15, v9, Landroidx/fragment/app/a1;->e:I

    .line 846
    .line 847
    iget v11, v9, Landroidx/fragment/app/a1;->f:I

    .line 848
    .line 849
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 850
    .line 851
    invoke-virtual {v10, v14, v15, v11, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 852
    .line 853
    .line 854
    const/4 v9, 0x0

    .line 855
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->c(Landroidx/fragment/app/y;)V

    .line 859
    .line 860
    .line 861
    goto :goto_1a

    .line 862
    :pswitch_14
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 863
    .line 864
    iget v14, v9, Landroidx/fragment/app/a1;->e:I

    .line 865
    .line 866
    iget v15, v9, Landroidx/fragment/app/a1;->f:I

    .line 867
    .line 868
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 869
    .line 870
    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->g(Landroidx/fragment/app/y;)V

    .line 874
    .line 875
    .line 876
    goto :goto_1a

    .line 877
    :pswitch_15
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 878
    .line 879
    iget v14, v9, Landroidx/fragment/app/a1;->e:I

    .line 880
    .line 881
    iget v15, v9, Landroidx/fragment/app/a1;->f:I

    .line 882
    .line 883
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 884
    .line 885
    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 886
    .line 887
    .line 888
    const/4 v9, 0x0

    .line 889
    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 890
    .line 891
    .line 892
    invoke-static {v10}, Landroidx/fragment/app/s0;->Z(Landroidx/fragment/app/y;)V

    .line 893
    .line 894
    .line 895
    goto :goto_1a

    .line 896
    :pswitch_16
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 897
    .line 898
    iget v14, v9, Landroidx/fragment/app/a1;->e:I

    .line 899
    .line 900
    iget v15, v9, Landroidx/fragment/app/a1;->f:I

    .line 901
    .line 902
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 903
    .line 904
    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->G(Landroidx/fragment/app/y;)V

    .line 908
    .line 909
    .line 910
    goto :goto_1a

    .line 911
    :pswitch_17
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 912
    .line 913
    iget v14, v9, Landroidx/fragment/app/a1;->e:I

    .line 914
    .line 915
    iget v15, v9, Landroidx/fragment/app/a1;->f:I

    .line 916
    .line 917
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 918
    .line 919
    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->Q(Landroidx/fragment/app/y;)V

    .line 923
    .line 924
    .line 925
    :goto_1a
    const/4 v11, 0x0

    .line 926
    goto :goto_1b

    .line 927
    :pswitch_18
    iget v11, v9, Landroidx/fragment/app/a1;->d:I

    .line 928
    .line 929
    iget v14, v9, Landroidx/fragment/app/a1;->e:I

    .line 930
    .line 931
    iget v15, v9, Landroidx/fragment/app/a1;->f:I

    .line 932
    .line 933
    iget v9, v9, Landroidx/fragment/app/a1;->g:I

    .line 934
    .line 935
    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/y;->R(IIII)V

    .line 936
    .line 937
    .line 938
    const/4 v11, 0x0

    .line 939
    invoke-virtual {v12, v10, v11}, Landroidx/fragment/app/s0;->V(Landroidx/fragment/app/y;Z)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12, v10}, Landroidx/fragment/app/s0;->a(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 943
    .line 944
    .line 945
    :goto_1b
    add-int/lit8 v13, v13, 0x1

    .line 946
    .line 947
    goto/16 :goto_17

    .line 948
    .line 949
    :cond_21
    const/4 v11, 0x0

    .line 950
    add-int/lit8 v1, v1, 0x1

    .line 951
    .line 952
    goto/16 :goto_11

    .line 953
    .line 954
    :cond_22
    move-object/from16 v5, p2

    .line 955
    .line 956
    add-int/lit8 v1, v4, -0x1

    .line 957
    .line 958
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    check-cast v1, Ljava/lang/Boolean;

    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    move/from16 v3, p3

    .line 969
    .line 970
    :goto_1c
    if-ge v3, v4, :cond_27

    .line 971
    .line 972
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    check-cast v6, Landroidx/fragment/app/a;

    .line 977
    .line 978
    if-eqz v1, :cond_24

    .line 979
    .line 980
    iget-object v7, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 981
    .line 982
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 983
    .line 984
    .line 985
    move-result v7

    .line 986
    const/4 v8, 0x1

    .line 987
    sub-int/2addr v7, v8

    .line 988
    :goto_1d
    if-ltz v7, :cond_26

    .line 989
    .line 990
    iget-object v8, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 991
    .line 992
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v8

    .line 996
    check-cast v8, Landroidx/fragment/app/a1;

    .line 997
    .line 998
    iget-object v8, v8, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 999
    .line 1000
    if-eqz v8, :cond_23

    .line 1001
    .line 1002
    invoke-virtual {v0, v8}, Landroidx/fragment/app/s0;->f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v8

    .line 1006
    invoke-virtual {v8}, Landroidx/fragment/app/z0;->k()V

    .line 1007
    .line 1008
    .line 1009
    :cond_23
    add-int/lit8 v7, v7, -0x1

    .line 1010
    .line 1011
    goto :goto_1d

    .line 1012
    :cond_24
    iget-object v6, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1013
    .line 1014
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v6

    .line 1018
    :cond_25
    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v7

    .line 1022
    if-eqz v7, :cond_26

    .line 1023
    .line 1024
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v7

    .line 1028
    check-cast v7, Landroidx/fragment/app/a1;

    .line 1029
    .line 1030
    iget-object v7, v7, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 1031
    .line 1032
    if-eqz v7, :cond_25

    .line 1033
    .line 1034
    invoke-virtual {v0, v7}, Landroidx/fragment/app/s0;->f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v7

    .line 1038
    invoke-virtual {v7}, Landroidx/fragment/app/z0;->k()V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_1e

    .line 1042
    :cond_26
    add-int/lit8 v3, v3, 0x1

    .line 1043
    .line 1044
    goto :goto_1c

    .line 1045
    :cond_27
    iget v3, v0, Landroidx/fragment/app/s0;->s:I

    .line 1046
    .line 1047
    const/4 v6, 0x1

    .line 1048
    invoke-virtual {v0, v3, v6}, Landroidx/fragment/app/s0;->L(IZ)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v3, Ljava/util/HashSet;

    .line 1052
    .line 1053
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    move/from16 v6, p3

    .line 1057
    .line 1058
    :goto_1f
    if-ge v6, v4, :cond_2a

    .line 1059
    .line 1060
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    check-cast v7, Landroidx/fragment/app/a;

    .line 1065
    .line 1066
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1067
    .line 1068
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v7

    .line 1072
    :cond_28
    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v8

    .line 1076
    if-eqz v8, :cond_29

    .line 1077
    .line 1078
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v8

    .line 1082
    check-cast v8, Landroidx/fragment/app/a1;

    .line 1083
    .line 1084
    iget-object v8, v8, Landroidx/fragment/app/a1;->b:Landroidx/fragment/app/y;

    .line 1085
    .line 1086
    if-eqz v8, :cond_28

    .line 1087
    .line 1088
    iget-object v8, v8, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 1089
    .line 1090
    if-eqz v8, :cond_28

    .line 1091
    .line 1092
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v9

    .line 1096
    invoke-static {v8, v9}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v8

    .line 1100
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    goto :goto_20

    .line 1104
    :cond_29
    add-int/lit8 v6, v6, 0x1

    .line 1105
    .line 1106
    goto :goto_1f

    .line 1107
    :cond_2a
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    :goto_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    if-eqz v6, :cond_2b

    .line 1116
    .line 1117
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v6

    .line 1121
    check-cast v6, Landroidx/fragment/app/n1;

    .line 1122
    .line 1123
    iput-boolean v1, v6, Landroidx/fragment/app/n1;->d:Z

    .line 1124
    .line 1125
    invoke-virtual {v6}, Landroidx/fragment/app/n1;->g()V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v6}, Landroidx/fragment/app/n1;->c()V

    .line 1129
    .line 1130
    .line 1131
    goto :goto_21

    .line 1132
    :cond_2b
    move/from16 v1, p3

    .line 1133
    .line 1134
    :goto_22
    if-ge v1, v4, :cond_2d

    .line 1135
    .line 1136
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    check-cast v3, Landroidx/fragment/app/a;

    .line 1141
    .line 1142
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v6

    .line 1146
    check-cast v6, Ljava/lang/Boolean;

    .line 1147
    .line 1148
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v6

    .line 1152
    if-eqz v6, :cond_2c

    .line 1153
    .line 1154
    iget v6, v3, Landroidx/fragment/app/a;->r:I

    .line 1155
    .line 1156
    if-ltz v6, :cond_2c

    .line 1157
    .line 1158
    const/4 v6, -0x1

    .line 1159
    iput v6, v3, Landroidx/fragment/app/a;->r:I

    .line 1160
    .line 1161
    goto :goto_23

    .line 1162
    :cond_2c
    const/4 v6, -0x1

    .line 1163
    :goto_23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    add-int/lit8 v1, v1, 0x1

    .line 1167
    .line 1168
    goto :goto_22

    .line 1169
    :cond_2d
    return-void

    .line 1170
    nop

    .line 1171
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

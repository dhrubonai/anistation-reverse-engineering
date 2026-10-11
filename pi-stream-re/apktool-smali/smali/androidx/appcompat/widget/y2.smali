.class public final Landroidx/appcompat/widget/y2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Landroid/graphics/PorterDuff$Mode;

.field public static i:Landroidx/appcompat/widget/y2;

.field public static final j:Landroidx/appcompat/widget/w2;


# instance fields
.field public a:Ljava/util/WeakHashMap;

.field public b:Ln/k;

.field public c:Ln/l;

.field public final d:Ljava/util/WeakHashMap;

.field public e:Landroid/util/TypedValue;

.field public f:Z

.field public g:Landroidx/appcompat/widget/w;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Landroidx/appcompat/widget/y2;->h:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/w2;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/appcompat/widget/w2;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/appcompat/widget/y2;->j:Landroidx/appcompat/widget/w2;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->d:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized d()Landroidx/appcompat/widget/y2;
    .locals 2

    .line 1
    const-class v0, Landroidx/appcompat/widget/y2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/y2;->i:Landroidx/appcompat/widget/y2;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroidx/appcompat/widget/y2;

    .line 9
    .line 10
    invoke-direct {v1}, Landroidx/appcompat/widget/y2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Landroidx/appcompat/widget/y2;->i:Landroidx/appcompat/widget/y2;

    .line 14
    .line 15
    invoke-static {v1}, Landroidx/appcompat/widget/y2;->j(Landroidx/appcompat/widget/y2;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v1, Landroidx/appcompat/widget/y2;->i:Landroidx/appcompat/widget/y2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0

    .line 24
    throw v1
.end method

.method public static declared-synchronized h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Landroidx/appcompat/widget/y2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/y2;->j:Landroidx/appcompat/widget/w2;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    add-int/lit8 v2, p0, 0x1f

    .line 10
    .line 11
    mul-int/lit8 v2, v2, 0x1f

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v3, v2

    .line 18
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v3}, Ln/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/PorterDuffColorFilter;

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    .line 31
    .line 32
    invoke-direct {v3, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v2

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v1, p0, v3}, Ln/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    :cond_0
    monitor-exit v0

    .line 54
    return-object v3

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit v0

    .line 57
    throw p0
.end method

.method public static j(Landroidx/appcompat/widget/y2;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/v2;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/v2;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const-string v1, "vector"

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/y2;->a(Ljava/lang/String;Landroidx/appcompat/widget/v2;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/appcompat/widget/v2;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/v2;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const-string v1, "animated-vector"

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/y2;->a(Ljava/lang/String;Landroidx/appcompat/widget/v2;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/appcompat/widget/v2;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/v2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const-string v1, "animated-selector"

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/y2;->a(Ljava/lang/String;Landroidx/appcompat/widget/v2;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroidx/appcompat/widget/v2;

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/v2;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "drawable"

    .line 47
    .line 48
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/y2;->a(Ljava/lang/String;Landroidx/appcompat/widget/v2;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroidx/appcompat/widget/v2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln/k;

    .line 6
    .line 7
    invoke-direct {v0}, Ln/k;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final declared-synchronized b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 3
    .line 4
    .line 5
    move-result-object p4

    .line 6
    if-eqz p4, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->d:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ln/i;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ln/i;

    .line 19
    .line 20
    invoke-direct {v0}, Ln/i;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroidx/appcompat/widget/y2;->d:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p2, p3}, Ln/i;->f(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :cond_1
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit p0

    .line 42
    throw p1
.end method

.method public final c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 20
    .line 21
    .line 22
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 23
    .line 24
    int-to-long v3, v1

    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    shl-long/2addr v3, v1

    .line 28
    iget v1, v0, Landroid/util/TypedValue;->data:I

    .line 29
    .line 30
    int-to-long v5, v1

    .line 31
    or-long/2addr v3, v5

    .line 32
    invoke-virtual {p0, p1, v3, v4}, Landroidx/appcompat/widget/y2;->e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const v1, 0x7f080038

    .line 45
    .line 46
    .line 47
    if-ne p2, v1, :cond_3

    .line 48
    .line 49
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    const v5, 0x7f080037

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, v5}, Landroidx/appcompat/widget/y2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const/4 v6, 0x0

    .line 62
    aput-object v5, v1, v6

    .line 63
    .line 64
    const v5, 0x7f080039

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1, v5}, Landroidx/appcompat/widget/y2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    aput-object v5, v1, v2

    .line 72
    .line 73
    invoke-direct {p2, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const v1, 0x7f08005b

    .line 78
    .line 79
    .line 80
    if-ne p2, v1, :cond_4

    .line 81
    .line 82
    const p2, 0x7f07003b

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/w;->c(Landroidx/appcompat/widget/y2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const v1, 0x7f08005a

    .line 91
    .line 92
    .line 93
    if-ne p2, v1, :cond_5

    .line 94
    .line 95
    const p2, 0x7f07003c

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/w;->c(Landroidx/appcompat/widget/y2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    const v1, 0x7f08005c

    .line 104
    .line 105
    .line 106
    if-ne p2, v1, :cond_6

    .line 107
    .line 108
    const p2, 0x7f07003d

    .line 109
    .line 110
    .line 111
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/w;->c(Landroidx/appcompat/widget/y2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    goto :goto_1

    .line 116
    :cond_6
    :goto_0
    const/4 p2, 0x0

    .line 117
    :goto_1
    if-eqz p2, :cond_7

    .line 118
    .line 119
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 120
    .line 121
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1, v3, v4, p2}, Landroidx/appcompat/widget/y2;->b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    .line 125
    .line 126
    .line 127
    :cond_7
    return-object p2
.end method

.method public final declared-synchronized e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->d:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ln/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-object v1

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {v0, v1, p2, p3}, Ln/i;->e(Ljava/lang/Long;J)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    monitor-exit p0

    .line 40
    return-object p1

    .line 41
    :cond_1
    :try_start_2
    iget-object p1, v0, Ln/i;->b:[J

    .line 42
    .line 43
    iget v2, v0, Ln/i;->d:I

    .line 44
    .line 45
    invoke-static {p1, v2, p2, p3}, Lj5/a;->c([JIJ)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ltz p1, :cond_2

    .line 50
    .line 51
    iget-object p2, v0, Ln/i;->c:[Ljava/lang/Object;

    .line 52
    .line 53
    aget-object p3, p2, p1

    .line 54
    .line 55
    sget-object v2, Ln/i;->e:Ljava/lang/Object;

    .line 56
    .line 57
    if-eq p3, v2, :cond_2

    .line 58
    .line 59
    aput-object v2, p2, p1

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput-boolean p1, v0, Ln/i;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    :cond_2
    monitor-exit p0

    .line 65
    return-object v1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit p0

    .line 68
    throw p1
.end method

.method public final declared-synchronized f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/appcompat/widget/y2;->g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-object p1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    monitor-exit p0

    .line 11
    throw p1
.end method

.method public final declared-synchronized g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/y2;->f:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iput-boolean v2, p0, Landroidx/appcompat/widget/y2;->f:Z

    .line 10
    .line 11
    const v0, 0x7f080076

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/y2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    instance-of v3, v0, Lr3/o;

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v3, "android.graphics.drawable.VectorDrawable"

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    move v0, v2

    .line 44
    :goto_1
    if-eqz v0, :cond_1a

    .line 45
    .line 46
    :goto_2
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v0, :cond_b

    .line 50
    .line 51
    invoke-virtual {v0}, Ln/k;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_b

    .line 56
    .line 57
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->c:Ln/l;

    .line 58
    .line 59
    const-string v4, "appcompat_skip_skip"

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0, p2, v3}, Ln/l;->c(ILjava/lang/Integer;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_b

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v5, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 78
    .line 79
    invoke-virtual {v5, v0, v3}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_3
    new-instance v0, Ln/l;

    .line 88
    .line 89
    invoke-direct {v0}, Ln/l;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->c:Ln/l;

    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    new-instance v0, Landroid/util/TypedValue;

    .line 99
    .line 100
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 104
    .line 105
    :cond_5
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->e:Landroid/util/TypedValue;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v5, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 112
    .line 113
    .line 114
    iget v6, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 115
    .line 116
    int-to-long v6, v6

    .line 117
    const/16 v8, 0x20

    .line 118
    .line 119
    shl-long/2addr v6, v8

    .line 120
    iget v8, v0, Landroid/util/TypedValue;->data:I

    .line 121
    .line 122
    int-to-long v8, v8

    .line 123
    or-long/2addr v6, v8

    .line 124
    invoke-virtual {p0, p1, v6, v7}, Landroidx/appcompat/widget/y2;->e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    if-eqz v8, :cond_6

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_6
    iget-object v9, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 132
    .line 133
    if-eqz v9, :cond_a

    .line 134
    .line 135
    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    const-string v10, ".xml"

    .line 140
    .line 141
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    if-eqz v9, :cond_a

    .line 146
    .line 147
    :try_start_1
    invoke-virtual {v5, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    :goto_3
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    const/4 v11, 0x2

    .line 160
    if-eq v10, v11, :cond_7

    .line 161
    .line 162
    if-eq v10, v2, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    if-ne v10, v11, :cond_9

    .line 166
    .line 167
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    iget-object v11, p0, Landroidx/appcompat/widget/y2;->c:Ln/l;

    .line 172
    .line 173
    invoke-virtual {v11, p2, v10}, Ln/l;->a(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v11, p0, Landroidx/appcompat/widget/y2;->b:Ln/k;

    .line 177
    .line 178
    invoke-virtual {v11, v10, v3}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Landroidx/appcompat/widget/x2;

    .line 183
    .line 184
    if-eqz v10, :cond_8

    .line 185
    .line 186
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    check-cast v10, Landroidx/appcompat/widget/v2;

    .line 191
    .line 192
    invoke-virtual {v10, p1, v5, v9, v11}, Landroidx/appcompat/widget/v2;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    :cond_8
    if-eqz v8, :cond_a

    .line 197
    .line 198
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 199
    .line 200
    invoke-virtual {v8, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, p1, v6, v7, v8}, Landroidx/appcompat/widget/y2;->b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :catchall_0
    move-exception p1

    .line 208
    goto/16 :goto_b

    .line 209
    .line 210
    :cond_9
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 211
    .line 212
    const-string v5, "No start tag found"

    .line 213
    .line 214
    invoke-direct {v0, v5}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    :catch_0
    move-exception v0

    .line 219
    :try_start_2
    const-string v5, "ResourceManagerInternal"

    .line 220
    .line 221
    const-string v6, "Exception while inflating drawable"

    .line 222
    .line 223
    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 224
    .line 225
    .line 226
    :cond_a
    :goto_4
    if-nez v8, :cond_c

    .line 227
    .line 228
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->c:Ln/l;

    .line 229
    .line 230
    invoke-virtual {v0, p2, v4}, Ln/l;->a(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_b
    :goto_5
    move-object v8, v3

    .line 235
    :cond_c
    :goto_6
    if-nez v8, :cond_d

    .line 236
    .line 237
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/y2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    :cond_d
    if-nez v8, :cond_e

    .line 242
    .line 243
    invoke-static {p1, p2}, Lx/j;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    :cond_e
    if-eqz v8, :cond_18

    .line 248
    .line 249
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/y2;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_12

    .line 254
    .line 255
    sget-object p1, Landroidx/appcompat/widget/v1;->a:[I

    .line 256
    .line 257
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-static {p1, v0}, La0/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 262
    .line 263
    .line 264
    iget-object p3, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;

    .line 265
    .line 266
    if-nez p3, :cond_f

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_f
    const p3, 0x7f080069

    .line 270
    .line 271
    .line 272
    if-ne p2, p3, :cond_10

    .line 273
    .line 274
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 275
    .line 276
    :cond_10
    :goto_7
    if-eqz v3, :cond_11

    .line 277
    .line 278
    invoke-static {p1, v3}, La0/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 279
    .line 280
    .line 281
    :cond_11
    move-object v3, p1

    .line 282
    goto/16 :goto_a

    .line 283
    .line 284
    :cond_12
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;

    .line 285
    .line 286
    if-eqz v0, :cond_16

    .line 287
    .line 288
    const v0, 0x7f080064

    .line 289
    .line 290
    .line 291
    const v4, 0x102000d

    .line 292
    .line 293
    .line 294
    const v5, 0x102000f

    .line 295
    .line 296
    .line 297
    const/high16 v6, 0x1020000

    .line 298
    .line 299
    const v7, 0x7f0400ea

    .line 300
    .line 301
    .line 302
    const v9, 0x7f0400ec

    .line 303
    .line 304
    .line 305
    if-ne p2, v0, :cond_13

    .line 306
    .line 307
    move-object v0, v8

    .line 308
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 309
    .line 310
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-static {p1, v9}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    sget-object v10, Landroidx/appcompat/widget/x;->b:Landroid/graphics/PorterDuff$Mode;

    .line 319
    .line 320
    invoke-static {v1, v6, v10}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-static {p1, v9}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    invoke-static {v1, v5, v10}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {p1, v7}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    invoke-static {v0, v1, v10}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_13
    const v0, 0x7f08005b

    .line 347
    .line 348
    .line 349
    if-eq p2, v0, :cond_14

    .line 350
    .line 351
    const v0, 0x7f08005a

    .line 352
    .line 353
    .line 354
    if-eq p2, v0, :cond_14

    .line 355
    .line 356
    const v0, 0x7f08005c

    .line 357
    .line 358
    .line 359
    if-ne p2, v0, :cond_15

    .line 360
    .line 361
    :cond_14
    move-object v0, v8

    .line 362
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 363
    .line 364
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {p1, v9}, Landroidx/appcompat/widget/v3;->b(Landroid/content/Context;I)I

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    sget-object v9, Landroidx/appcompat/widget/x;->b:Landroid/graphics/PorterDuff$Mode;

    .line 373
    .line 374
    invoke-static {v1, v6, v9}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {p1, v7}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    invoke-static {v1, v5, v9}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-static {p1, v7}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-static {v0, v1, v9}, Landroidx/appcompat/widget/w;->e(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 397
    .line 398
    .line 399
    :goto_8
    move v1, v2

    .line 400
    :cond_15
    if-eqz v1, :cond_16

    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_16
    invoke-virtual {p0, p1, p2, v8}, Landroidx/appcompat/widget/y2;->m(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    if-nez p1, :cond_17

    .line 408
    .line 409
    if-eqz p3, :cond_17

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_17
    :goto_9
    move-object v3, v8

    .line 413
    :goto_a
    move-object v8, v3

    .line 414
    :cond_18
    if-eqz v8, :cond_19

    .line 415
    .line 416
    invoke-static {v8}, Landroidx/appcompat/widget/v1;->a(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 417
    .line 418
    .line 419
    :cond_19
    monitor-exit p0

    .line 420
    return-object v8

    .line 421
    :cond_1a
    :try_start_3
    iput-boolean v1, p0, Landroidx/appcompat/widget/y2;->f:Z

    .line 422
    .line 423
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 424
    .line 425
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 426
    .line 427
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 431
    :goto_b
    monitor-exit p0

    .line 432
    throw p1
.end method

.method public final declared-synchronized i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->a:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ln/l;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p2, v1}, Ln/l;->c(ILjava/lang/Integer;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    move-object v0, v1

    .line 25
    :goto_0
    if-nez v0, :cond_5

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/w;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_1
    if-eqz v1, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->a:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Landroidx/appcompat/widget/y2;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->a:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ln/l;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    new-instance v0, Ln/l;

    .line 60
    .line 61
    invoke-direct {v0}, Ln/l;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Landroidx/appcompat/widget/y2;->a:Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0, p2, v1}, Ln/l;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :cond_4
    move-object v0, v1

    .line 73
    :cond_5
    monitor-exit p0

    .line 74
    return-object v0

    .line 75
    :goto_2
    monitor-exit p0

    .line 76
    throw p1
.end method

.method public final declared-synchronized k(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->d:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ln/i;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ln/i;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit p0

    .line 19
    throw p1
.end method

.method public final declared-synchronized l(Landroidx/appcompat/widget/w;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

.method public final m(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/y2;->g:Landroidx/appcompat/widget/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    sget-object v2, Landroidx/appcompat/widget/x;->b:Landroid/graphics/PorterDuff$Mode;

    .line 7
    .line 8
    iget-object v3, v0, Landroidx/appcompat/widget/w;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [I

    .line 11
    .line 12
    invoke-static {v3, p2}, Landroidx/appcompat/widget/w;->a([II)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, -0x1

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const p2, 0x7f0400ec

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, v0, Landroidx/appcompat/widget/w;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, [I

    .line 27
    .line 28
    invoke-static {v3, p2}, Landroidx/appcompat/widget/w;->a([II)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const p2, 0x7f0400ea

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v0, v0, Landroidx/appcompat/widget/w;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, [I

    .line 41
    .line 42
    invoke-static {v0, p2}, Landroidx/appcompat/widget/w;->a([II)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const v0, 0x7f08004d

    .line 52
    .line 53
    .line 54
    if-ne p2, v0, :cond_3

    .line 55
    .line 56
    const p2, 0x42233333    # 40.8f

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const v0, 0x1010030

    .line 64
    .line 65
    .line 66
    move-object v3, v2

    .line 67
    move v2, v0

    .line 68
    move v0, p2

    .line 69
    move p2, v4

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const v0, 0x7f08003b

    .line 72
    .line 73
    .line 74
    if-ne p2, v0, :cond_4

    .line 75
    .line 76
    :goto_0
    const p2, 0x1010031

    .line 77
    .line 78
    .line 79
    :goto_1
    move v0, p2

    .line 80
    move p2, v4

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move p2, v1

    .line 83
    move v0, p2

    .line 84
    :goto_2
    move-object v3, v2

    .line 85
    move v2, v0

    .line 86
    move v0, v5

    .line 87
    :goto_3
    if-eqz p2, :cond_6

    .line 88
    .line 89
    sget-object p2, Landroidx/appcompat/widget/v1;->a:[I

    .line 90
    .line 91
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-static {p1, v2}, Landroidx/appcompat/widget/v3;->c(Landroid/content/Context;I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    const-class p3, Landroidx/appcompat/widget/x;

    .line 100
    .line 101
    monitor-enter p3

    .line 102
    :try_start_0
    invoke-static {p1, v3}, Landroidx/appcompat/widget/y2;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    monitor-exit p3

    .line 107
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 108
    .line 109
    .line 110
    if-eq v0, v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 113
    .line 114
    .line 115
    :cond_5
    move p1, v4

    .line 116
    goto :goto_4

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    monitor-exit p3

    .line 119
    throw p1

    .line 120
    :cond_6
    move p1, v1

    .line 121
    :goto_4
    if-eqz p1, :cond_7

    .line 122
    .line 123
    move v1, v4

    .line 124
    :cond_7
    return v1
.end method

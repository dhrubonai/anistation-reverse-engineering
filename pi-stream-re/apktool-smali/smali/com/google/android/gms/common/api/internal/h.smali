.class public final Lcom/google/android/gms/common/api/internal/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final G:Lcom/google/android/gms/common/api/Status;

.field public static final H:Lcom/google/android/gms/common/api/Status;

.field public static final I:Ljava/lang/Object;

.field public static J:Lcom/google/android/gms/common/api/internal/h;


# instance fields
.field public final A:Ljava/util/concurrent/ConcurrentHashMap;

.field public B:Lcom/google/android/gms/common/api/internal/a0;

.field public final C:Ln/f;

.field public final D:Ln/f;

.field public final E:Lcom/google/android/gms/internal/base/zaq;

.field public volatile F:Z

.field public a:J

.field public b:Z

.field public c:Lcom/google/android/gms/common/internal/u;

.field public d:Ld5/b;

.field public final e:Landroid/content/Context;

.field public final f:Lb5/d;

.field public final x:Lz3/e;

.field public final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final z:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const-string v1, "Sign-out occurred while this API call was in progress."

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/common/api/internal/h;->G:Lcom/google/android/gms/common/api/Status;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 12
    .line 13
    const-string v1, "The user must be signed in to make this API call."

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/google/android/gms/common/api/internal/h;->H:Lcom/google/android/gms/common/api/Status;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lb5/d;->d:Lb5/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lcom/google/android/gms/common/api/internal/h;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/h;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 40
    .line 41
    new-instance v2, Ln/f;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Ln/f;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->C:Ln/f;

    .line 47
    .line 48
    new-instance v2, Ln/f;

    .line 49
    .line 50
    invoke-direct {v2, v1}, Ln/f;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->D:Ln/f;

    .line 54
    .line 55
    iput-boolean v3, p0, Lcom/google/android/gms/common/api/internal/h;->F:Z

    .line 56
    .line 57
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 58
    .line 59
    new-instance v2, Lcom/google/android/gms/internal/base/zaq;

    .line 60
    .line 61
    invoke-direct {v2, p2, p0}, Lcom/google/android/gms/internal/base/zaq;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->f:Lb5/d;

    .line 67
    .line 68
    new-instance p2, Lz3/e;

    .line 69
    .line 70
    invoke-direct {p2}, Lz3/e;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/h;->x:Lz3/e;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Lj5/a;->h:Ljava/lang/Boolean;

    .line 80
    .line 81
    if-nez p2, :cond_2

    .line 82
    .line 83
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    const/16 v0, 0x1a

    .line 86
    .line 87
    if-lt p2, v0, :cond_0

    .line 88
    .line 89
    move p2, v3

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move p2, v1

    .line 92
    :goto_0
    if-eqz p2, :cond_1

    .line 93
    .line 94
    const-string p2, "android.hardware.type.automotive"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move v3, v1

    .line 104
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sput-object p1, Lj5/a;->h:Ljava/lang/Boolean;

    .line 109
    .line 110
    :cond_2
    sget-object p1, Lj5/a;->h:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/h;->F:Z

    .line 119
    .line 120
    :cond_3
    const/4 p1, 0x6

    .line 121
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/h;->J:Lcom/google/android/gms/common/api/internal/h;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v1
.end method

.method public static e(Lcom/google/android/gms/common/api/internal/a;Lb5/a;)Lcom/google/android/gms/common/api/Status;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/a;->b:Lcom/google/android/gms/common/api/i;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/common/api/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x3f

    .line 26
    .line 27
    add-int/2addr v1, v2

    .line 28
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const-string v1, "API: "

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, " is not available on this device. Connection failed with: "

    .line 40
    .line 41
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/16 v2, 0x11

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    iget-object v4, p1, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 55
    .line 56
    move-object v0, v6

    .line 57
    move-object v5, p1

    .line 58
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/Status;-><init>(IILjava/lang/String;Landroid/app/PendingIntent;Lb5/a;)V

    .line 59
    .line 60
    .line 61
    return-object v6
.end method

.method public static g(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/h;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/h;->J:Lcom/google/android/gms/common/api/internal/h;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/common/internal/l;->a()Landroid/os/HandlerThread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lcom/google/android/gms/common/api/internal/h;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v3, Lb5/d;->c:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/common/api/internal/h;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lcom/google/android/gms/common/api/internal/h;->J:Lcom/google/android/gms/common/api/internal/h;

    .line 28
    .line 29
    :cond_0
    sget-object p0, Lcom/google/android/gms/common/api/internal/h;->J:Lcom/google/android/gms/common/api/internal/h;

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/internal/a0;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->C:Ln/f;

    .line 11
    .line 12
    invoke-virtual {v1}, Ln/f;->clear()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->C:Ln/f;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->e:Ln/f;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ln/f;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method

.method public final c()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/h;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/s;->a()Lcom/google/android/gms/common/internal/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lcom/google/android/gms/common/internal/s;->a:Lcom/google/android/gms/common/internal/t;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/t;->b:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return v1

    .line 21
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->x:Lz3/e;

    .line 22
    .line 23
    iget-object v0, v0, Lz3/e;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/util/SparseIntArray;

    .line 26
    .line 27
    const v2, 0xc1fa340

    .line 28
    .line 29
    .line 30
    const/4 v3, -0x1

    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eq v0, v3, :cond_4

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    return v1

    .line 41
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final d(Lb5/a;I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->f:Lb5/d;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-class v2, Lj5/a;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    sget-object v4, Lj5/a;->a:Landroid/content/Context;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    sget-object v8, Lj5/a;->b:Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    if-eq v4, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit v2

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_0
    :try_start_1
    sput-object v5, Lj5/a;->b:Ljava/lang/Boolean;

    .line 36
    .line 37
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v8, 0x1a

    .line 40
    .line 41
    if-lt v4, v8, :cond_2

    .line 42
    .line 43
    move v4, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v4, v7

    .line 46
    :goto_1
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v4}, Lh0/f;->x(Landroid/content/pm/PackageManager;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sput-object v4, Lj5/a;->b:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v8, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    .line 68
    .line 69
    invoke-virtual {v4, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    sput-object v4, Lj5/a;->b:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catch_0
    :try_start_3
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    sput-object v4, Lj5/a;->b:Ljava/lang/Boolean;

    .line 80
    .line 81
    :goto_2
    sput-object v3, Lj5/a;->a:Landroid/content/Context;

    .line 82
    .line 83
    sget-object v3, Lj5/a;->b:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    monitor-exit v2

    .line 90
    :goto_3
    if-eqz v3, :cond_4

    .line 91
    .line 92
    goto :goto_7

    .line 93
    :cond_4
    iget v2, p1, Lb5/a;->b:I

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v3, p1, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    move v3, v6

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move v3, v7

    .line 104
    :goto_4
    const/high16 v4, 0x8000000

    .line 105
    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    iget-object v2, p1, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    invoke-virtual {v0, v1, v5, v2}, Lb5/d;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_7

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    sget v3, Lcom/google/android/gms/internal/common/zzd;->zza:I

    .line 119
    .line 120
    or-int/2addr v3, v4

    .line 121
    invoke-static {v1, v7, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    :goto_5
    move-object v2, v5

    .line 126
    :goto_6
    if-eqz v2, :cond_8

    .line 127
    .line 128
    iget p1, p1, Lb5/a;->b:I

    .line 129
    .line 130
    sget v3, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 131
    .line 132
    new-instance v3, Landroid/content/Intent;

    .line 133
    .line 134
    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 135
    .line 136
    invoke-direct {v3, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    const-string v5, "pending_intent"

    .line 140
    .line 141
    invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    const-string v2, "failing_client_id"

    .line 145
    .line 146
    invoke-virtual {v3, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    const-string p2, "notify_manager"

    .line 150
    .line 151
    invoke-virtual {v3, p2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    sget p2, Lcom/google/android/gms/internal/base/zal;->zaa:I

    .line 155
    .line 156
    or-int/2addr p2, v4

    .line 157
    invoke-static {v1, v7, v3, p2}, Lcom/google/android/gms/internal/base/zal;->zaa(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {v0, v1, p1, p2}, Lb5/d;->g(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 162
    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_8
    :goto_7
    move v6, v7

    .line 166
    :goto_8
    return v6

    .line 167
    :catchall_0
    move-exception p1

    .line 168
    monitor-exit v2

    .line 169
    throw p1
.end method

.method public final f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/g0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lcom/google/android/gms/common/api/internal/g0;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/internal/g0;

    .line 16
    .line 17
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/common/api/internal/g0;-><init>(Lcom/google/android/gms/common/api/internal/h;Lcom/google/android/gms/common/api/l;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->D:Ln/f;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ln/f;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/g0;->n()V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public final h(Lb5/a;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/api/internal/h;->d(Lb5/a;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 12

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const-string v1, "GoogleApiManager"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/h;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    const-wide/32 v4, 0x493e0

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0x11

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v2, 0x1f

    .line 23
    .line 24
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const-string v2, "Unknown message id: "

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    return v8

    .line 43
    :pswitch_0
    iput-boolean v8, p0, Lcom/google/android/gms/common/api/internal/h;->b:Z

    .line 44
    .line 45
    goto/16 :goto_b

    .line 46
    .line 47
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/google/android/gms/common/api/internal/o0;

    .line 50
    .line 51
    iget-wide v0, p1, Lcom/google/android/gms/common/api/internal/o0;->c:J

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    cmp-long v0, v0, v3

    .line 56
    .line 57
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/o0;->a:Lcom/google/android/gms/common/internal/q;

    .line 58
    .line 59
    iget v3, p1, Lcom/google/android/gms/common/api/internal/o0;->b:I

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    new-instance p1, Lcom/google/android/gms/common/internal/u;

    .line 64
    .line 65
    new-array v0, v9, [Lcom/google/android/gms/common/internal/q;

    .line 66
    .line 67
    aput-object v1, v0, v8

    .line 68
    .line 69
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p1, v3, v0}, Lcom/google/android/gms/common/internal/u;-><init>(ILjava/util/List;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 77
    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    new-instance v0, Ld5/b;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ld5/b;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 88
    .line 89
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ld5/b;->c(Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 92
    .line 93
    .line 94
    goto/16 :goto_b

    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    iget-object v4, v0, Lcom/google/android/gms/common/internal/u;->b:Ljava/util/List;

    .line 101
    .line 102
    iget v0, v0, Lcom/google/android/gms/common/internal/u;->a:I

    .line 103
    .line 104
    if-ne v0, v3, :cond_4

    .line 105
    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v4, p1, Lcom/google/android/gms/common/api/internal/o0;->d:I

    .line 113
    .line 114
    if-lt v0, v4, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 118
    .line 119
    iget-object v4, v0, Lcom/google/android/gms/common/internal/u;->b:Ljava/util/List;

    .line 120
    .line 121
    if-nez v4, :cond_3

    .line 122
    .line 123
    new-instance v4, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object v4, v0, Lcom/google/android/gms/common/internal/u;->b:Ljava/util/List;

    .line 129
    .line 130
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/internal/u;->b:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    :goto_0
    invoke-virtual {v2, v7}, Landroid/os/Handler;->removeMessages(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget v4, v0, Lcom/google/android/gms/common/internal/u;->a:I

    .line 144
    .line 145
    if-gtz v4, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/h;->c()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    :cond_5
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 154
    .line 155
    if-nez v4, :cond_6

    .line 156
    .line 157
    new-instance v4, Ld5/b;

    .line 158
    .line 159
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 160
    .line 161
    invoke-direct {v4, v5}, Ld5/b;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    iput-object v4, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 165
    .line 166
    :cond_6
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 167
    .line 168
    invoke-virtual {v4, v0}, Ld5/b;->c(Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 169
    .line 170
    .line 171
    :cond_7
    iput-object v6, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 172
    .line 173
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 174
    .line 175
    if-nez v0, :cond_1f

    .line 176
    .line 177
    new-instance v0, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    new-instance v1, Lcom/google/android/gms/common/internal/u;

    .line 186
    .line 187
    invoke-direct {v1, v3, v0}, Lcom/google/android/gms/common/internal/u;-><init>(ILjava/util/List;)V

    .line 188
    .line 189
    .line 190
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 191
    .line 192
    invoke-virtual {v2, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-wide v3, p1, Lcom/google/android/gms/common/api/internal/o0;->c:J

    .line 197
    .line 198
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 199
    .line 200
    .line 201
    goto/16 :goto_b

    .line 202
    .line 203
    :pswitch_2
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 204
    .line 205
    if-eqz p1, :cond_1f

    .line 206
    .line 207
    iget v0, p1, Lcom/google/android/gms/common/internal/u;->a:I

    .line 208
    .line 209
    if-gtz v0, :cond_9

    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/h;->c()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 218
    .line 219
    if-nez v0, :cond_a

    .line 220
    .line 221
    new-instance v0, Ld5/b;

    .line 222
    .line 223
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 224
    .line 225
    invoke-direct {v0, v1}, Ld5/b;-><init>(Landroid/content/Context;)V

    .line 226
    .line 227
    .line 228
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 229
    .line 230
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->d:Ld5/b;

    .line 231
    .line 232
    invoke-virtual {v0, p1}, Ld5/b;->c(Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 233
    .line 234
    .line 235
    :cond_b
    iput-object v6, p0, Lcom/google/android/gms/common/api/internal/h;->c:Lcom/google/android/gms/common/internal/u;

    .line 236
    .line 237
    goto/16 :goto_b

    .line 238
    .line 239
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, Lcom/google/android/gms/common/api/internal/h0;

    .line 242
    .line 243
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 244
    .line 245
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_1f

    .line 250
    .line 251
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 252
    .line 253
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Lcom/google/android/gms/common/api/internal/g0;

    .line 258
    .line 259
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_1f

    .line 266
    .line 267
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 268
    .line 269
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 270
    .line 271
    const/16 v3, 0xf

    .line 272
    .line 273
    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 277
    .line 278
    const/16 v2, 0x10

    .line 279
    .line 280
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, Ljava/util/ArrayList;

    .line 284
    .line 285
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    :cond_c
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    iget-object v5, p1, Lcom/google/android/gms/common/api/internal/h0;->b:Lb5/c;

    .line 303
    .line 304
    if-eqz v4, :cond_f

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Lcom/google/android/gms/common/api/internal/b1;

    .line 311
    .line 312
    instance-of v6, v4, Lcom/google/android/gms/common/api/internal/m0;

    .line 313
    .line 314
    if-eqz v6, :cond_c

    .line 315
    .line 316
    move-object v6, v4

    .line 317
    check-cast v6, Lcom/google/android/gms/common/api/internal/m0;

    .line 318
    .line 319
    invoke-virtual {v6, v0}, Lcom/google/android/gms/common/api/internal/m0;->g(Lcom/google/android/gms/common/api/internal/g0;)[Lb5/c;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    if-eqz v6, :cond_c

    .line 324
    .line 325
    array-length v7, v6

    .line 326
    move v10, v8

    .line 327
    :goto_3
    if-ge v10, v7, :cond_e

    .line 328
    .line 329
    aget-object v11, v6, v10

    .line 330
    .line 331
    invoke-static {v11, v5}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    if-eqz v11, :cond_d

    .line 336
    .line 337
    if-ltz v10, :cond_e

    .line 338
    .line 339
    move v5, v9

    .line 340
    goto :goto_4

    .line 341
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_e
    move v5, v8

    .line 345
    :goto_4
    if-eqz v5, :cond_c

    .line 346
    .line 347
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :cond_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    :goto_5
    if-ge v8, p1, :cond_1f

    .line 356
    .line 357
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Lcom/google/android/gms/common/api/internal/b1;

    .line 362
    .line 363
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    new-instance v3, Lcom/google/android/gms/common/api/w;

    .line 367
    .line 368
    invoke-direct {v3, v5}, Lcom/google/android/gms/common/api/w;-><init>(Lb5/c;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/b1;->b(Ljava/lang/RuntimeException;)V

    .line 372
    .line 373
    .line 374
    add-int/lit8 v8, v8, 0x1

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast p1, Lcom/google/android/gms/common/api/internal/h0;

    .line 380
    .line 381
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 382
    .line 383
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_1f

    .line 388
    .line 389
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 390
    .line 391
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Lcom/google/android/gms/common/api/internal/g0;

    .line 396
    .line 397
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    if-nez p1, :cond_10

    .line 404
    .line 405
    goto/16 :goto_b

    .line 406
    .line 407
    :cond_10
    iget-boolean p1, v0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 408
    .line 409
    if-nez p1, :cond_1f

    .line 410
    .line 411
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 412
    .line 413
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    if-nez p1, :cond_11

    .line 418
    .line 419
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/g0;->n()V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_b

    .line 423
    .line 424
    :cond_11
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/g0;->g()V

    .line 425
    .line 426
    .line 427
    goto/16 :goto_b

    .line 428
    .line 429
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast p1, Lcom/google/android/gms/common/api/internal/b0;

    .line 432
    .line 433
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/b0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 434
    .line 435
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/b0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 440
    .line 441
    if-nez v1, :cond_12

    .line 442
    .line 443
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    goto/16 :goto_b

    .line 449
    .line 450
    :cond_12
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Lcom/google/android/gms/common/api/internal/g0;

    .line 455
    .line 456
    invoke-virtual {v0, v8}, Lcom/google/android/gms/common/api/internal/g0;->m(Z)Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_b

    .line 468
    .line 469
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 470
    .line 471
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_1f

    .line 476
    .line 477
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 478
    .line 479
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    check-cast p1, Lcom/google/android/gms/common/api/internal/g0;

    .line 484
    .line 485
    invoke-virtual {p1, v9}, Lcom/google/android/gms/common/api/internal/g0;->m(Z)Z

    .line 486
    .line 487
    .line 488
    goto/16 :goto_b

    .line 489
    .line 490
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 491
    .line 492
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_1f

    .line 497
    .line 498
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 499
    .line 500
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    check-cast p1, Lcom/google/android/gms/common/api/internal/g0;

    .line 505
    .line 506
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 507
    .line 508
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 509
    .line 510
    invoke-static {v1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 511
    .line 512
    .line 513
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 514
    .line 515
    if-eqz v1, :cond_1f

    .line 516
    .line 517
    if-eqz v1, :cond_13

    .line 518
    .line 519
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 520
    .line 521
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 522
    .line 523
    iget-object v3, p1, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 524
    .line 525
    const/16 v4, 0xb

    .line 526
    .line 527
    invoke-virtual {v2, v4, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 531
    .line 532
    const/16 v2, 0x9

    .line 533
    .line 534
    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    iput-boolean v8, p1, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 538
    .line 539
    :cond_13
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->f:Lb5/d;

    .line 540
    .line 541
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 542
    .line 543
    invoke-virtual {v1, v0}, Lb5/d;->b(Landroid/content/Context;)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    const/16 v1, 0x12

    .line 548
    .line 549
    if-ne v0, v1, :cond_14

    .line 550
    .line 551
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 552
    .line 553
    const/16 v1, 0x15

    .line 554
    .line 555
    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    .line 556
    .line 557
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto :goto_6

    .line 561
    :cond_14
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 562
    .line 563
    const/16 v1, 0x16

    .line 564
    .line 565
    const-string v2, "API failed to connect while resuming due to an unknown error."

    .line 566
    .line 567
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    :goto_6
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 571
    .line 572
    .line 573
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 574
    .line 575
    const-string v0, "Timing out connection while resuming."

    .line 576
    .line 577
    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    goto/16 :goto_b

    .line 581
    .line 582
    :pswitch_8
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->D:Ln/f;

    .line 583
    .line 584
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    new-instance v0, Ln/a;

    .line 588
    .line 589
    invoke-direct {v0, p1}, Ln/a;-><init>(Ln/f;)V

    .line 590
    .line 591
    .line 592
    :cond_15
    :goto_7
    invoke-virtual {v0}, Ln/h;->hasNext()Z

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-eqz v1, :cond_16

    .line 597
    .line 598
    invoke-virtual {v0}, Ln/h;->next()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, Lcom/google/android/gms/common/api/internal/a;

    .line 603
    .line 604
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    check-cast v1, Lcom/google/android/gms/common/api/internal/g0;

    .line 609
    .line 610
    if-eqz v1, :cond_15

    .line 611
    .line 612
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/g0;->q()V

    .line 613
    .line 614
    .line 615
    goto :goto_7

    .line 616
    :cond_16
    invoke-virtual {p1}, Ln/f;->clear()V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_b

    .line 620
    .line 621
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 622
    .line 623
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_1f

    .line 628
    .line 629
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 630
    .line 631
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    check-cast p1, Lcom/google/android/gms/common/api/internal/g0;

    .line 636
    .line 637
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 638
    .line 639
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 640
    .line 641
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 642
    .line 643
    .line 644
    iget-boolean v0, p1, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 645
    .line 646
    if-eqz v0, :cond_1f

    .line 647
    .line 648
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/g0;->n()V

    .line 649
    .line 650
    .line 651
    goto/16 :goto_b

    .line 652
    .line 653
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast p1, Lcom/google/android/gms/common/api/l;

    .line 656
    .line 657
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/h;->f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/g0;

    .line 658
    .line 659
    .line 660
    goto/16 :goto_b

    .line 661
    .line 662
    :pswitch_b
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 663
    .line 664
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    instance-of v0, v0, Landroid/app/Application;

    .line 669
    .line 670
    if-eqz v0, :cond_1f

    .line 671
    .line 672
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    check-cast p1, Landroid/app/Application;

    .line 677
    .line 678
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/c;->a(Landroid/app/Application;)V

    .line 679
    .line 680
    .line 681
    sget-object p1, Lcom/google/android/gms/common/api/internal/c;->e:Lcom/google/android/gms/common/api/internal/c;

    .line 682
    .line 683
    new-instance v0, Lcom/google/android/gms/common/api/internal/d0;

    .line 684
    .line 685
    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/internal/d0;-><init>(Lcom/google/android/gms/common/api/internal/h;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    monitor-enter p1

    .line 692
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/c;->c:Ljava/util/ArrayList;

    .line 693
    .line 694
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 698
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/c;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 699
    .line 700
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-nez v1, :cond_17

    .line 705
    .line 706
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 707
    .line 708
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    if-nez v0, :cond_17

    .line 719
    .line 720
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 721
    .line 722
    const/16 v1, 0x64

    .line 723
    .line 724
    if-le v0, v1, :cond_17

    .line 725
    .line 726
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 727
    .line 728
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 729
    .line 730
    .line 731
    :cond_17
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 734
    .line 735
    .line 736
    move-result p1

    .line 737
    if-nez p1, :cond_1f

    .line 738
    .line 739
    iput-wide v4, p0, Lcom/google/android/gms/common/api/internal/h;->a:J

    .line 740
    .line 741
    goto/16 :goto_b

    .line 742
    .line 743
    :catchall_0
    move-exception v0

    .line 744
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 745
    throw v0

    .line 746
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 747
    .line 748
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast p1, Lb5/a;

    .line 751
    .line 752
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    :cond_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    if-eqz v3, :cond_19

    .line 765
    .line 766
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    check-cast v3, Lcom/google/android/gms/common/api/internal/g0;

    .line 771
    .line 772
    iget v4, v3, Lcom/google/android/gms/common/api/internal/g0;->g:I

    .line 773
    .line 774
    if-ne v4, v0, :cond_18

    .line 775
    .line 776
    move-object v6, v3

    .line 777
    :cond_19
    if-eqz v6, :cond_1b

    .line 778
    .line 779
    iget v0, p1, Lb5/a;->b:I

    .line 780
    .line 781
    const/16 v1, 0xd

    .line 782
    .line 783
    if-ne v0, v1, :cond_1a

    .line 784
    .line 785
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 786
    .line 787
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/h;->f:Lb5/d;

    .line 788
    .line 789
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    sget-object v2, Lb5/g;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 793
    .line 794
    invoke-static {v0}, Lb5/a;->d(I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    iget-object p1, p1, Lb5/a;->d:Ljava/lang/String;

    .line 807
    .line 808
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    new-instance v4, Ljava/lang/StringBuilder;

    .line 817
    .line 818
    add-int/lit8 v2, v2, 0x45

    .line 819
    .line 820
    add-int/2addr v2, v3

    .line 821
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 822
    .line 823
    .line 824
    const-string v2, "Error resolution was canceled by the user, original error message: "

    .line 825
    .line 826
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    const-string v0, ": "

    .line 833
    .line 834
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object p1

    .line 844
    invoke-direct {v1, v7, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v6, v1}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 848
    .line 849
    .line 850
    goto/16 :goto_b

    .line 851
    .line 852
    :cond_1a
    iget-object v0, v6, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 853
    .line 854
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/h;->e(Lcom/google/android/gms/common/api/internal/a;Lb5/a;)Lcom/google/android/gms/common/api/Status;

    .line 855
    .line 856
    .line 857
    move-result-object p1

    .line 858
    invoke-virtual {v6, p1}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 859
    .line 860
    .line 861
    goto/16 :goto_b

    .line 862
    .line 863
    :cond_1b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 864
    .line 865
    const/16 v2, 0x4c

    .line 866
    .line 867
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 868
    .line 869
    .line 870
    const-string v2, "Could not find API instance "

    .line 871
    .line 872
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    const-string v0, " while trying to fail enqueued calls."

    .line 879
    .line 880
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 881
    .line 882
    .line 883
    new-instance v0, Ljava/lang/Exception;

    .line 884
    .line 885
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 886
    .line 887
    .line 888
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object p1

    .line 892
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 893
    .line 894
    .line 895
    goto/16 :goto_b

    .line 896
    .line 897
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast p1, Lcom/google/android/gms/common/api/internal/p0;

    .line 900
    .line 901
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/p0;->c:Lcom/google/android/gms/common/api/l;

    .line 902
    .line 903
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    check-cast v0, Lcom/google/android/gms/common/api/internal/g0;

    .line 912
    .line 913
    if-nez v0, :cond_1c

    .line 914
    .line 915
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/p0;->c:Lcom/google/android/gms/common/api/l;

    .line 916
    .line 917
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/h;->f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/g0;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    :cond_1c
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 922
    .line 923
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 924
    .line 925
    .line 926
    move-result v1

    .line 927
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/p0;->a:Lcom/google/android/gms/common/api/internal/b1;

    .line 928
    .line 929
    if-eqz v1, :cond_1d

    .line 930
    .line 931
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/h;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 932
    .line 933
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    iget p1, p1, Lcom/google/android/gms/common/api/internal/p0;->b:I

    .line 938
    .line 939
    if-eq v1, p1, :cond_1d

    .line 940
    .line 941
    sget-object p1, Lcom/google/android/gms/common/api/internal/h;->G:Lcom/google/android/gms/common/api/Status;

    .line 942
    .line 943
    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/b1;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/g0;->q()V

    .line 947
    .line 948
    .line 949
    goto :goto_b

    .line 950
    :cond_1d
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/g0;->o(Lcom/google/android/gms/common/api/internal/b1;)V

    .line 951
    .line 952
    .line 953
    goto :goto_b

    .line 954
    :pswitch_e
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 955
    .line 956
    .line 957
    move-result-object p1

    .line 958
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 959
    .line 960
    .line 961
    move-result-object p1

    .line 962
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-eqz v0, :cond_1f

    .line 967
    .line 968
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    check-cast v0, Lcom/google/android/gms/common/api/internal/g0;

    .line 973
    .line 974
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 975
    .line 976
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 977
    .line 978
    invoke-static {v1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 979
    .line 980
    .line 981
    iput-object v6, v0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 982
    .line 983
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/g0;->n()V

    .line 984
    .line 985
    .line 986
    goto :goto_8

    .line 987
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 988
    .line 989
    invoke-static {p1}, La3/g;->z(Ljava/lang/Object;)V

    .line 990
    .line 991
    .line 992
    throw v6

    .line 993
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast p1, Ljava/lang/Boolean;

    .line 996
    .line 997
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 998
    .line 999
    .line 1000
    move-result p1

    .line 1001
    if-eq v9, p1, :cond_1e

    .line 1002
    .line 1003
    goto :goto_9

    .line 1004
    :cond_1e
    const-wide/16 v4, 0x2710

    .line 1005
    .line 1006
    :goto_9
    iput-wide v4, p0, Lcom/google/android/gms/common/api/internal/h;->a:J

    .line 1007
    .line 1008
    const/16 p1, 0xc

    .line 1009
    .line 1010
    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v1

    .line 1025
    if-eqz v1, :cond_1f

    .line 1026
    .line 1027
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    check-cast v1, Lcom/google/android/gms/common/api/internal/a;

    .line 1032
    .line 1033
    invoke-virtual {v2, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/h;->a:J

    .line 1038
    .line 1039
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1040
    .line 1041
    .line 1042
    goto :goto_a

    .line 1043
    :cond_1f
    :goto_b
    return v9

    .line 1044
    nop

    .line 1045
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

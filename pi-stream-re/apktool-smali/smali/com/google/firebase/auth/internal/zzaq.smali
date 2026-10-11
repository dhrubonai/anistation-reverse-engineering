.class public final Lcom/google/firebase/auth/internal/zzaq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zzc:Le5/a;


# instance fields
.field volatile zza:J

.field volatile zzb:J

.field private final zzd:Lcom/google/firebase/FirebaseApp;

.field private zze:J

.field private zzf:Landroid/os/HandlerThread;

.field private zzg:Landroid/os/Handler;

.field private zzh:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le5/a;

    .line 2
    .line 3
    const-string v1, "FirebaseAuth:"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "TokenRefresher"

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Le5/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/firebase/auth/internal/zzaq;->zzc:Le5/a;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/FirebaseApp;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/firebase/auth/internal/zzaq;->zzc:Le5/a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "Initializing TokenRefresher"

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Le5/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaq;->zzd:Lcom/google/firebase/FirebaseApp;

    .line 18
    .line 19
    new-instance v0, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v1, "TokenRefresher"

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzf:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zzf:Landroid/os/HandlerThread;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzg;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzg:Landroid/os/Handler;

    .line 45
    .line 46
    new-instance v0, Lcom/google/firebase/auth/internal/zzat;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p0, p1}, Lcom/google/firebase/auth/internal/zzat;-><init>(Lcom/google/firebase/auth/internal/zzaq;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzh:Ljava/lang/Runnable;

    .line 56
    .line 57
    const-wide/32 v0, 0x493e0

    .line 58
    .line 59
    .line 60
    iput-wide v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zze:J

    .line 61
    .line 62
    return-void
.end method

.method public static bridge synthetic zza()Le5/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/auth/internal/zzaq;->zzc:Le5/a;

    return-object v0
.end method


# virtual methods
.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzg:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zzh:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzc()V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/firebase/auth/internal/zzaq;->zzc:Le5/a;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zza:J

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/google/firebase/auth/internal/zzaq;->zze:J

    .line 6
    .line 7
    sub-long/2addr v1, v3

    .line 8
    const-string v3, "Scheduling refresh for "

    .line 9
    .line 10
    invoke-static {v3, v1, v2}, La3/g;->q(Ljava/lang/String;J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Le5/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaq;->zzb()V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-wide v2, p0, Lcom/google/firebase/auth/internal/zzaq;->zza:J

    .line 28
    .line 29
    sub-long/2addr v2, v0

    .line 30
    iget-wide v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zze:J

    .line 31
    .line 32
    sub-long/2addr v2, v0

    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide/16 v2, 0x3e8

    .line 40
    .line 41
    div-long/2addr v0, v2

    .line 42
    iput-wide v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzg:Landroid/os/Handler;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zzh:Ljava/lang/Runnable;

    .line 47
    .line 48
    iget-wide v4, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 49
    .line 50
    mul-long/2addr v4, v2

    .line 51
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final zzd()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    const/16 v1, 0x1e

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x3c

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/16 v1, 0x78

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/16 v1, 0xf0

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x1e0

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x3c0

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    const-wide/16 v0, 0x1e

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 v0, 0x3c0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide/16 v0, 0x2

    .line 35
    .line 36
    iget-wide v2, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 37
    .line 38
    mul-long/2addr v0, v2

    .line 39
    :goto_0
    iput-wide v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-wide v2, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 46
    .line 47
    const-wide/16 v4, 0x3e8

    .line 48
    .line 49
    mul-long/2addr v2, v4

    .line 50
    add-long/2addr v2, v0

    .line 51
    iput-wide v2, p0, Lcom/google/firebase/auth/internal/zzaq;->zza:J

    .line 52
    .line 53
    sget-object v0, Lcom/google/firebase/auth/internal/zzaq;->zzc:Le5/a;

    .line 54
    .line 55
    iget-wide v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zza:J

    .line 56
    .line 57
    const-string v3, "Scheduling refresh for "

    .line 58
    .line 59
    invoke-static {v3, v1, v2}, La3/g;->q(Ljava/lang/String;J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x0

    .line 64
    new-array v2, v2, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Le5/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaq;->zzg:Landroid/os/Handler;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaq;->zzh:Ljava/lang/Runnable;

    .line 72
    .line 73
    iget-wide v2, p0, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 74
    .line 75
    mul-long/2addr v2, v4

    .line 76
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

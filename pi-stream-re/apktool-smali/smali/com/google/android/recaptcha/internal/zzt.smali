.class public final Lcom/google/android/recaptcha/internal/zzt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzr;


# instance fields
.field private final zzb:Lp7/y;

.field private final zzc:Lp7/y;

.field private final zzd:Lp7/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/recaptcha/internal/zzr;-><init>(Li7/e;)V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzt;->zza:Lcom/google/android/recaptcha/internal/zzr;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt7/f;

    .line 5
    .line 6
    new-instance v1, Lp7/s1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, Lp7/s1;-><init>(Lp7/a1;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lp7/i0;->a:Lu7/d;

    .line 13
    .line 14
    sget-object v3, Lt7/s;->a:Lp7/m1;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lp7/k1;->t(Lz6/i;)Lz6/i;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lt7/f;-><init>(Lz6/i;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzt;->zzb:Lp7/y;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lp7/v1;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lp7/v1;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lp7/v0;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lp7/v0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lt7/f;

    .line 46
    .line 47
    sget-object v3, Landroidx/lifecycle/q0;->x:Landroidx/lifecycle/q0;

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Lp7/w;->r(Lz6/h;)Lz6/g;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v4, Lp7/d1;

    .line 57
    .line 58
    invoke-direct {v4, v2}, Lp7/d1;-><init>(Lp7/a1;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v4}, Lq6/g;->L(Lz6/i;Lz6/i;)Lz6/i;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_0
    invoke-direct {v0, v1}, Lt7/f;-><init>(Lz6/i;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lcom/google/android/recaptcha/internal/zzs;

    .line 69
    .line 70
    invoke-direct {v1, v2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lz6/e;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Lr6/h0;->k0(Lp7/y;Lh7/p;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzt;->zzc:Lp7/y;

    .line 77
    .line 78
    sget-object v0, Lp7/i0;->b:Lu7/c;

    .line 79
    .line 80
    new-instance v1, Lt7/f;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Lp7/w;->r(Lz6/h;)Lz6/g;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    new-instance v3, Lp7/d1;

    .line 90
    .line 91
    invoke-direct {v3, v2}, Lp7/d1;-><init>(Lp7/a1;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v3}, Lq6/g;->L(Lz6/i;Lz6/i;)Lz6/i;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_1
    invoke-direct {v1, v0}, Lt7/f;-><init>(Lz6/i;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzt;->zzd:Lp7/y;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final zza()Lp7/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzt;->zzd:Lp7/y;

    return-object v0
.end method

.method public final zzb()Lp7/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzt;->zzb:Lp7/y;

    return-object v0
.end method

.method public final zzc()Lp7/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzt;->zzc:Lp7/y;

    return-object v0
.end method

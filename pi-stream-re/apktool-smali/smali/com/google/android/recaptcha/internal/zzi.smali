.class final Lcom/google/android/recaptcha/internal/zzi;
.super Li7/h;
.source "SourceFile"

# interfaces
.implements Lh7/l;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic zzb:Lp7/d0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lp7/d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzi;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzi;->zzb:Lp7/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Li7/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzi;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Exception;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzi;->zzb:Lp7/d0;

    .line 16
    .line 17
    check-cast p1, Lp7/k1;

    .line 18
    .line 19
    invoke-virtual {p1}, Lp7/k1;->B()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, Lp7/x0;

    .line 24
    .line 25
    xor-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    if-eqz v0, :cond_6

    .line 28
    .line 29
    instance-of v0, p1, Lp7/t;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    check-cast p1, Lp7/t;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object p1, v1

    .line 38
    :goto_0
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, Lp7/t;->a:Ljava/lang/Throwable;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object p1, v1

    .line 44
    :goto_1
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzi;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzi;->zzb:Lp7/d0;

    .line 49
    .line 50
    invoke-interface {v0}, Lp7/d0;->f()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzi;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 59
    .line 60
    instance-of v2, p1, Ljava/lang/Exception;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    move-object v1, p1

    .line 65
    check-cast v1, Ljava/lang/Exception;

    .line 66
    .line 67
    :cond_4
    if-nez v1, :cond_5

    .line 68
    .line 69
    new-instance v1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Lcom/google/android/gms/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    sget-object p1, Lw6/f;->a:Lw6/f;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v0, "This job has not completed yet"

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

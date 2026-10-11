.class final Lcom/google/android/play/core/integrity/ac;
.super Lp6/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/play/core/integrity/ad;

.field private final b:Lp6/v;

.field private final c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ad;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/play/core/integrity/ac;->a:Lcom/google/android/play/core/integrity/ad;

    .line 2
    .line 3
    invoke-direct {p0}, Lp6/t;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp6/v;

    .line 7
    .line 8
    const-string v0, "OnRequestIntegrityTokenCallback"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lp6/v;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/play/core/integrity/ac;->b:Lp6/v;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/google/android/play/core/integrity/ac;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ac;->a:Lcom/google/android/play/core/integrity/ad;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/play/core/integrity/ad;->a:Lp6/c;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/play/core/integrity/ac;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lp6/c;->d(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ac;->b:Lp6/v;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v2, "onRequestIntegrityToken"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "error"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/play/core/integrity/ac;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 30
    .line 31
    new-instance v2, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 32
    .line 33
    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string v0, "token"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, Lcom/google/android/play/core/integrity/ac;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 49
    .line 50
    new-instance v0, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 51
    .line 52
    const/16 v2, -0x64

    .line 53
    .line 54
    invoke-direct {v0, v2, v1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v2, 0x21

    .line 64
    .line 65
    if-lt v1, v2, :cond_2

    .line 66
    .line 67
    invoke-static {p1}, Landroidx/activity/k;->j(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Landroid/app/PendingIntent;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const-string v1, "dialog.intent"

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Landroid/app/PendingIntent;

    .line 81
    .line 82
    :goto_0
    iget-object v1, p0, Lcom/google/android/play/core/integrity/ac;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 83
    .line 84
    new-instance v2, Lcom/google/android/play/core/integrity/a;

    .line 85
    .line 86
    invoke-direct {v2}, Lcom/google/android/play/core/integrity/a;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Lcom/google/android/play/core/integrity/a;->c(Ljava/lang/String;)Lcom/google/android/play/core/integrity/ag;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ac;->b:Lp6/v;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Lcom/google/android/play/core/integrity/a;->b(Lp6/v;)Lcom/google/android/play/core/integrity/ag;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1}, Lcom/google/android/play/core/integrity/a;->a(Landroid/app/PendingIntent;)Lcom/google/android/play/core/integrity/ag;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/google/android/play/core/integrity/a;->d()Lcom/google/android/play/core/integrity/ah;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    return-void
.end method

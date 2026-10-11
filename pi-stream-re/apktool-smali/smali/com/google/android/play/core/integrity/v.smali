.class final Lcom/google/android/play/core/integrity/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/google/android/play/core/integrity/o;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Lcom/google/android/play/core/integrity/o;
    .locals 3

    .line 1
    const-class v0, Lcom/google/android/play/core/integrity/v;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/play/core/integrity/v;->a:Lcom/google/android/play/core/integrity/o;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/play/core/integrity/m;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lcom/google/android/play/core/integrity/m;-><init>(Lcom/google/android/play/core/integrity/l;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    move-object p0, v2

    .line 21
    :cond_0
    invoke-virtual {v1, p0}, Lcom/google/android/play/core/integrity/m;->a(Landroid/content/Context;)Lcom/google/android/play/core/integrity/m;

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Lcom/google/android/play/core/integrity/t;->b()Lcom/google/android/play/core/integrity/o;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sput-object p0, Lcom/google/android/play/core/integrity/v;->a:Lcom/google/android/play/core/integrity/o;

    .line 29
    .line 30
    :cond_1
    sget-object p0, Lcom/google/android/play/core/integrity/v;->a:Lcom/google/android/play/core/integrity/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-object p0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    monitor-exit v0

    .line 36
    throw p0
.end method

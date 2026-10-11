.class public final Lcom/google/android/gms/common/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lcom/google/android/gms/common/internal/s;

.field public static final c:Lcom/google/android/gms/common/internal/t;


# instance fields
.field public a:Lcom/google/android/gms/common/internal/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Lcom/google/android/gms/common/internal/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/t;-><init>(IZZII)V

    sput-object v6, Lcom/google/android/gms/common/internal/s;->c:Lcom/google/android/gms/common/internal/t;

    return-void
.end method

.method public static declared-synchronized a()Lcom/google/android/gms/common/internal/s;
    .locals 2

    .line 1
    const-class v0, Lcom/google/android/gms/common/internal/s;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/internal/s;->b:Lcom/google/android/gms/common/internal/s;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/common/internal/s;

    invoke-direct {v1}, Lcom/google/android/gms/common/internal/s;-><init>()V

    sput-object v1, Lcom/google/android/gms/common/internal/s;->b:Lcom/google/android/gms/common/internal/s;

    :cond_0
    sget-object v1, Lcom/google/android/gms/common/internal/s;->b:Lcom/google/android/gms/common/internal/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

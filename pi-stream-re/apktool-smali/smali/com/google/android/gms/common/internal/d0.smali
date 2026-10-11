.class public abstract Lcom/google/android/gms/common/internal/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Z

.field public final synthetic c:Lcom/google/android/gms/common/internal/f;

.field public final d:I

.field public final e:Landroid/os/Bundle;

.field public final synthetic f:Lcom/google/android/gms/common/internal/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/f;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/d0;->f:Lcom/google/android/gms/common/internal/f;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/common/internal/d0;->c:Lcom/google/android/gms/common/internal/f;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/common/internal/d0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/google/android/gms/common/internal/d0;->b:Z

    .line 14
    .line 15
    iput p2, p0, Lcom/google/android/gms/common/internal/d0;->d:I

    .line 16
    .line 17
    iput-object p3, p0, Lcom/google/android/gms/common/internal/d0;->e:Landroid/os/Bundle;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final bridge a()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/common/internal/d0;->f:Lcom/google/android/gms/common/internal/f;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, Lcom/google/android/gms/common/internal/d0;->d:I

    .line 6
    .line 7
    if-nez v3, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/d0;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/internal/f;->zzi(Lcom/google/android/gms/common/internal/f;ILandroid/os/IInterface;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lb5/a;

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/d0;->b(Lb5/a;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/internal/f;->zzi(Lcom/google/android/gms/common/internal/f;ILandroid/os/IInterface;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/common/internal/d0;->e:Landroid/os/Bundle;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const-string v1, "pendingIntent"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v2, v0

    .line 43
    check-cast v2, Landroid/app/PendingIntent;

    .line 44
    .line 45
    :cond_2
    new-instance v0, Lb5/a;

    .line 46
    .line 47
    invoke-direct {v0, v3, v2}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/d0;->b(Lb5/a;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public abstract b(Lb5/a;)V
.end method

.method public abstract c()Z
.end method

.method public final d()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/common/internal/d0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw v0
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/d0;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/internal/d0;->c:Lcom/google/android/gms/common/internal/f;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->zzf(Lcom/google/android/gms/common/internal/f;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/internal/d0;->c:Lcom/google/android/gms/common/internal/f;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/android/gms/common/internal/f;->zzf(Lcom/google/android/gms/common/internal/f;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
.end method

.class final Lcom/google/android/gms/tasks/zzk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/tasks/Task;

.field final synthetic zzb:Lcom/google/android/gms/tasks/zzl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/zzl;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tasks/zzk;->zzb:Lcom/google/android/gms/tasks/zzl;

    iput-object p2, p0, Lcom/google/android/gms/tasks/zzk;->zza:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/tasks/zzk;->zzb:Lcom/google/android/gms/tasks/zzl;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/tasks/zzl;->zzb(Lcom/google/android/gms/tasks/zzl;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/tasks/zzk;->zzb:Lcom/google/android/gms/tasks/zzl;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/google/android/gms/tasks/zzl;->zza(Lcom/google/android/gms/tasks/zzl;)Lcom/google/android/gms/tasks/OnFailureListener;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, Lcom/google/android/gms/tasks/zzl;->zza(Lcom/google/android/gms/tasks/zzl;)Lcom/google/android/gms/tasks/OnFailureListener;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/google/android/gms/tasks/zzk;->zza:Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Lcom/google/android/gms/tasks/OnFailureListener;->onFailure(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
.end method

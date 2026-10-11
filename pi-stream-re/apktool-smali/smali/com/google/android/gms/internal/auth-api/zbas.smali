.class public final synthetic Lcom/google/android/gms/internal/auth-api/zbas;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/s;


# instance fields
.field public final synthetic zba:Lcom/google/android/gms/internal/auth-api/zbaw;

.field public final synthetic zbb:Lw4/k;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth-api/zbaw;Lw4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbas;->zba:Lcom/google/android/gms/internal/auth-api/zbaw;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbas;->zbb:Lw4/k;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbas;->zba:Lcom/google/android/gms/internal/auth-api/zbaw;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/auth-api/zbas;->zbb:Lw4/k;

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbx;

    .line 6
    .line 7
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    new-instance v2, Lcom/google/android/gms/internal/auth-api/zbav;

    .line 10
    .line 11
    invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/auth-api/zbav;-><init>(Lcom/google/android/gms/internal/auth-api/zbaw;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbad;

    .line 19
    .line 20
    invoke-static {v1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/auth-api/zbad;->zbd(Lcom/google/android/gms/internal/auth-api/zbal;Lw4/k;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

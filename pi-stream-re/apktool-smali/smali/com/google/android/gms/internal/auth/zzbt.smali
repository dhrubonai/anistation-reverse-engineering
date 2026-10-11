.class public final Lcom/google/android/gms/internal/auth/zzbt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSpatulaHeader(Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            ")",
            "Lcom/google/android/gms/common/api/q;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/auth/zzbs;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth/zzbs;-><init>(Lcom/google/android/gms/internal/auth/zzbt;Lcom/google/android/gms/common/api/o;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/o;->a(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final performProxyRequest(Lcom/google/android/gms/common/api/o;Ly4/a;)Lcom/google/android/gms/common/api/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "Ly4/a;",
            ")",
            "Lcom/google/android/gms/common/api/q;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/auth/zzbq;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzbq;-><init>(Lcom/google/android/gms/internal/auth/zzbt;Lcom/google/android/gms/common/api/o;Ly4/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/o;->a(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

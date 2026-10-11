.class public abstract Lcom/google/android/gms/common/internal/k;
.super Lcom/google/android/gms/common/internal/f;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/g;


# static fields
.field private static volatile zaa:Ljava/util/concurrent/Executor;


# instance fields
.field private final zab:Lcom/google/android/gms/common/internal/h;

.field private final zac:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final zad:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/h;Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/internal/p;)V
    .locals 9

    .line 1
    sget-object v0, Lcom/google/android/gms/common/internal/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/internal/l;->b:Lcom/google/android/gms/common/internal/q0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/common/internal/q0;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/internal/q0;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/google/android/gms/common/internal/l;->b:Lcom/google/android/gms/common/internal/q0;

    .line 22
    .line 23
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    sget-object v4, Lcom/google/android/gms/common/internal/l;->b:Lcom/google/android/gms/common/internal/q0;

    .line 25
    .line 26
    sget-object v0, Lb5/d;->c:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p5}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p6}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lk3/d;

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    invoke-direct {v6, p5, v0}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    new-instance v7, Lk3/d;

    .line 42
    .line 43
    const/16 p5, 0x13

    .line 44
    .line 45
    invoke-direct {v7, p6, p5}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iget-object v8, p4, Lcom/google/android/gms/common/internal/h;->f:Ljava/lang/String;

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    move-object v2, p1

    .line 52
    move-object v3, p2

    .line 53
    move v5, p3

    .line 54
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/common/internal/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/q0;ILk3/d;Lk3/d;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object p4, p0, Lcom/google/android/gms/common/internal/k;->zab:Lcom/google/android/gms/common/internal/h;

    .line 58
    .line 59
    iget-object p1, p4, Lcom/google/android/gms/common/internal/h;->a:Landroid/accounts/Account;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/google/android/gms/common/internal/k;->zad:Landroid/accounts/Account;

    .line 62
    .line 63
    iget-object p1, p4, Lcom/google/android/gms/common/internal/h;->c:Ljava/util/Set;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/k;->validateScopes(Ljava/util/Set;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    if-eqz p4, :cond_2

    .line 78
    .line 79
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    check-cast p4, Lcom/google/android/gms/common/api/Scope;

    .line 84
    .line 85
    invoke-interface {p1, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "Expanding scopes is not permitted, use implied scopes instead"

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_2
    iput-object p2, p0, Lcom/google/android/gms/common/internal/k;->zac:Ljava/util/Set;

    .line 101
    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    throw p1
.end method


# virtual methods
.method public final getAccount()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->zad:Landroid/accounts/Account;

    return-object v0
.end method

.method public final getBindServiceExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getClientSettings()Lcom/google/android/gms/common/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->zab:Lcom/google/android/gms/common/internal/h;

    return-object v0
.end method

.method public getRequiredFeatures()[Lb5/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Lb5/c;

    return-object v0
.end method

.method public final getScopes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->zac:Ljava/util/Set;

    return-object v0
.end method

.method public getScopesForConnectionlessNonSignIn()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/f;->requiresSignIn()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->zac:Ljava/util/Set;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    return-object v0
.end method

.method public validateScopes(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    return-object p1
.end method

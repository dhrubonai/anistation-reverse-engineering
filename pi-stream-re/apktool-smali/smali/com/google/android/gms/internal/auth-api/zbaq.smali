.class public final Lcom/google/android/gms/internal/auth-api/zbaq;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"


# static fields
.field private static final zba:Lcom/google/android/gms/common/api/h;

.field private static final zbb:Lcom/google/android/gms/common/api/a;

.field private static final zbc:Lcom/google/android/gms/common/api/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zba:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbao;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbao;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbaq;->zbb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "Auth.Api.Identity.Authorization.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lw4/p;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lcom/google/android/gms/common/api/i;

    .line 2
    iget-object p2, p2, Lw4/p;->a:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 3
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 6
    new-instance v1, Lw4/p;

    invoke-direct {v1, p2}, Lw4/p;-><init>(Ljava/lang/String;)V

    .line 7
    sget-object p2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 8
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw4/p;)V
    .locals 2

    .line 9
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lcom/google/android/gms/common/api/i;

    .line 10
    iget-object p2, p2, Lw4/p;->a:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 11
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p2

    .line 13
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 14
    new-instance v1, Lw4/p;

    invoke-direct {v1, p2}, Lw4/p;-><init>(Ljava/lang/String;)V

    .line 15
    sget-object p2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 16
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method


# virtual methods
.method public final authorize(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw4/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->a:Ljava/util/List;

    .line 5
    .line 6
    const/4 v9, 0x1

    .line 7
    const/4 v10, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v0, v9

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v10

    .line 19
    :goto_0
    const-string v2, "requestedScopes cannot be null or empty"

    .line 20
    .line 21
    invoke-static {v2, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->f:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Lw7/b;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v6, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v6, v0

    .line 35
    :goto_1
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->e:Landroid/accounts/Account;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move-object v5, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object v5, v0

    .line 42
    :goto_2
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->d:Z

    .line 43
    .line 44
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->b:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    move-object v0, v3

    .line 51
    move v4, v9

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move v4, v10

    .line 54
    :goto_3
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->c:Z

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    if-eqz v3, :cond_6

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    move v0, v10

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    :goto_4
    move v0, v9

    .line 72
    :goto_5
    const-string v2, "two different server client ids provided"

    .line 73
    .line 74
    invoke-static {v2, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    iget-boolean p1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->y:Z

    .line 78
    .line 79
    move v8, p1

    .line 80
    move-object v2, v3

    .line 81
    move v3, v9

    .line 82
    goto :goto_6

    .line 83
    :cond_6
    move-object v2, v0

    .line 84
    move v3, v10

    .line 85
    move v8, v3

    .line 86
    :goto_6
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApiOptions()Lcom/google/android/gms/common/api/e;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lw4/p;

    .line 91
    .line 92
    iget-object v7, p1, Lw4/p;->a:Ljava/lang/String;

    .line 93
    .line 94
    new-instance p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 95
    .line 96
    move-object v0, p1

    .line 97
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 101
    .line 102
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 103
    .line 104
    .line 105
    new-array v1, v9, [Lb5/c;

    .line 106
    .line 107
    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbbi;->zbc:Lb5/c;

    .line 108
    .line 109
    aput-object v2, v1, v10

    .line 110
    .line 111
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zban;

    .line 114
    .line 115
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zban;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 119
    .line 120
    iput-boolean v10, v0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 121
    .line 122
    const/16 p1, 0x5fe

    .line 123
    .line 124
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1
.end method

.method public final getAuthorizationResultFromIntent(Landroid/content/Intent;)Lw4/a;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->y:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    const-string v1, "status"

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    invoke-static {p1, v1, v2}, Lp7/a0;->p(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lc5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const-string v1, "authorization_result"

    .line 24
    .line 25
    sget-object v2, Lw4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 26
    .line 27
    invoke-static {p1, v1, v2}, Lp7/a0;->p(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lc5/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lw4/a;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 43
    .line 44
    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 49
    .line 50
    sget-object v0, Lcom/google/android/gms/common/api/Status;->A:Lcom/google/android/gms/common/api/Status;

    .line 51
    .line 52
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_3
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 57
    .line 58
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

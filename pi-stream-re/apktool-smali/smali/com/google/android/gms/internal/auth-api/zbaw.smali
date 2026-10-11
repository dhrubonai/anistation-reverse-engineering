.class public final Lcom/google/android/gms/internal/auth-api/zbaw;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"


# static fields
.field private static final zba:Lcom/google/android/gms/common/api/h;

.field private static final zbb:Lcom/google/android/gms/common/api/a;

.field private static final zbc:Lcom/google/android/gms/common/api/i;


# instance fields
.field private final zbd:Ljava/lang/String;


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
    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbaw;->zba:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbat;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbat;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbaw;->zbb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbaw;->zbc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lw4/q;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbc:Lcom/google/android/gms/common/api/i;

    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw4/q;)V
    .locals 2

    .line 3
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbc:Lcom/google/android/gms/common/api/i;

    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getStatusFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->y:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v1, "status"

    .line 7
    .line 8
    sget-object v2, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lp7/a0;->p(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lc5/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object p1
.end method

.method public final saveAccountLinkingToken(Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw4/j;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v5, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->a:Landroid/app/PendingIntent;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget v7, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->f:I

    .line 18
    .line 19
    iget-object p1, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    iget-object v6, p0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbd:Ljava/lang/String;

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v1, p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v0

    .line 33
    :goto_0
    const-string v8, "Consent PendingIntent cannot be null"

    .line 34
    .line 35
    invoke-static {v8, v1}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v1, "auth_code"

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-string v8, "Invalid tokenType"

    .line 45
    .line 46
    invoke-static {v8, v1}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    xor-int/2addr v1, p1

    .line 54
    const-string v8, "serviceId cannot be null or empty"

    .line 55
    .line 56
    invoke-static {v8, v1}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    move v1, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v1, v0

    .line 64
    :goto_1
    const-string v8, "scopes cannot be null"

    .line 65
    .line 66
    invoke-static {v8, v1}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 70
    .line 71
    move-object v1, v8

    .line 72
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;-><init>(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/google/android/gms/common/api/internal/v;

    .line 76
    .line 77
    invoke-direct {v1}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 78
    .line 79
    .line 80
    new-array p1, p1, [Lb5/c;

    .line 81
    .line 82
    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbbi;->zbg:Lb5/c;

    .line 83
    .line 84
    aput-object v2, p1, v0

    .line 85
    .line 86
    iput-object p1, v1, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance p1, Lcom/google/android/gms/internal/auth-api/zbar;

    .line 89
    .line 90
    invoke-direct {p1, p0, v8}, Lcom/google/android/gms/internal/auth-api/zbar;-><init>(Lcom/google/android/gms/internal/auth-api/zbaw;Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, v1, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 94
    .line 95
    iput-boolean v0, v1, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 96
    .line 97
    const/16 p1, 0x5ff

    .line 98
    .line 99
    iput p1, v1, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
.end method

.method public final savePassword(Lw4/k;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/k;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw4/l;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbaw;->zbd:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Lw4/k;

    .line 7
    .line 8
    iget-object v2, p1, Lw4/k;->a:Lw4/n;

    .line 9
    .line 10
    iget p1, p1, Lw4/k;->c:I

    .line 11
    .line 12
    invoke-direct {v1, v2, v0, p1}, Lw4/k;-><init>(Lw4/n;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/common/api/internal/v;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    new-array v0, v0, [Lb5/c;

    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbbi;->zbe:Lb5/c;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v2, v0, v3

    .line 27
    .line 28
    iput-object v0, p1, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbas;

    .line 31
    .line 32
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/auth-api/zbas;-><init>(Lcom/google/android/gms/internal/auth-api/zbaw;Lw4/k;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p1, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 36
    .line 37
    iput-boolean v3, p1, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 38
    .line 39
    const/16 v0, 0x600

    .line 40
    .line 41
    iput v0, p1, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

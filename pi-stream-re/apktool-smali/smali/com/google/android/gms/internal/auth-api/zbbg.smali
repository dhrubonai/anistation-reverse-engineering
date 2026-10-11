.class public final Lcom/google/android/gms/internal/auth-api/zbbg;
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
    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbbg;->zba:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbbb;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbbb;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbbg;->zbb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "Auth.Api.Identity.SignIn.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbbg;->zbc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lw4/r;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbc:Lcom/google/android/gms/common/api/i;

    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw4/r;)V
    .locals 2

    .line 3
    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbc:Lcom/google/android/gms/common/api/i;

    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final beginSignIn(Lw4/f;)Lcom/google/android/gms/tasks/Task;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw4/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-instance v1, Lc1/r;

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    invoke-direct {v1, v2}, Lc1/r;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, v1, Lc1/r;->a:Z

    .line 13
    .line 14
    iget-object v5, p1, Lw4/f;->b:Lw4/b;

    .line 15
    .line 16
    invoke-static {v5}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p1, Lw4/f;->a:Lw4/e;

    .line 20
    .line 21
    invoke-static {v4}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v9, p1, Lw4/f;->f:Lw4/d;

    .line 25
    .line 26
    invoke-static {v9}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v10, p1, Lw4/f;->x:Lw4/c;

    .line 30
    .line 31
    invoke-static {v10}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-boolean v7, p1, Lw4/f;->d:Z

    .line 35
    .line 36
    iget v8, p1, Lw4/f;->e:I

    .line 37
    .line 38
    iget-object v6, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    .line 39
    .line 40
    new-instance p1, Lw4/f;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    invoke-direct/range {v3 .. v10}, Lw4/f;-><init>(Lw4/e;Lw4/b;Ljava/lang/String;ZILw4/d;Lw4/c;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lcom/google/android/gms/common/api/internal/v;

    .line 47
    .line 48
    invoke-direct {v1}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 49
    .line 50
    .line 51
    new-array v0, v0, [Lb5/c;

    .line 52
    .line 53
    sget-object v3, Lcom/google/android/gms/internal/auth-api/zbbi;->zba:Lb5/c;

    .line 54
    .line 55
    aput-object v3, v0, v2

    .line 56
    .line 57
    iput-object v0, v1, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbax;

    .line 60
    .line 61
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbax;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;Lw4/f;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, v1, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 65
    .line 66
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 67
    .line 68
    const/16 p1, 0x611

    .line 69
    .line 70
    iput p1, v1, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public final getPhoneNumberFromIntent(Landroid/content/Intent;)Ljava/lang/String;
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
    const-string v1, "phone_number_hint_result"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 39
    .line 40
    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_2
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 45
    .line 46
    sget-object v0, Lcom/google/android/gms/common/api/Status;->A:Lcom/google/android/gms/common/api/Status;

    .line 47
    .line 48
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_3
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public final getPhoneNumberHintIntent(Lw4/h;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/h;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [Lb5/c;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sget-object v3, Lcom/google/android/gms/internal/auth-api/zbbi;->zbh:Lb5/c;

    .line 14
    .line 15
    aput-object v3, v1, v2

    .line 16
    .line 17
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbba;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbba;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;Lw4/h;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 25
    .line 26
    const/16 p1, 0x675

    .line 27
    .line 28
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final getSignInCredentialFromIntent(Landroid/content/Intent;)Lw4/m;
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
    const-string v1, "sign_in_credential"

    .line 24
    .line 25
    sget-object v2, Lw4/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 26
    .line 27
    invoke-static {p1, v1, v2}, Lp7/a0;->p(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lc5/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lw4/m;

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

.method public final getSignInIntent(Lw4/i;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, Lw4/i;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v4, p1, Lw4/i;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p1, Lw4/i;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v5, p1, Lw4/i;->e:Z

    .line 14
    .line 15
    iget v6, p1, Lw4/i;->f:I

    .line 16
    .line 17
    iget-object v3, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    .line 18
    .line 19
    new-instance p1, Lw4/i;

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    invoke-direct/range {v0 .. v6}, Lw4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    new-array v1, v1, [Lb5/c;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    sget-object v3, Lcom/google/android/gms/internal/auth-api/zbbi;->zbf:Lb5/c;

    .line 35
    .line 36
    aput-object v3, v1, v2

    .line 37
    .line 38
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbay;

    .line 41
    .line 42
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbay;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;Lw4/i;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 46
    .line 47
    const/16 p1, 0x613

    .line 48
    .line 49
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public final signOut()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.google.android.gms.signin"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lcom/google/android/gms/common/api/o;->a:Ljava/util/Set;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/common/api/internal/h;->a()V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 41
    .line 42
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    new-array v1, v1, [Lb5/c;

    .line 47
    .line 48
    sget-object v3, Lcom/google/android/gms/internal/auth-api/zbbi;->zbb:Lb5/c;

    .line 49
    .line 50
    aput-object v3, v1, v2

    .line 51
    .line 52
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbaz;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api/zbaz;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 60
    .line 61
    iput-boolean v2, v0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 62
    .line 63
    const/16 v1, 0x612

    .line 64
    .line 65
    iput v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/google/android/gms/common/api/o;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :catchall_0
    move-exception v1

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw v1
.end method

.method public final synthetic zba(Lw4/h;Lcom/google/android/gms/internal/auth-api/zbbh;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbbf;

    .line 2
    .line 3
    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/auth-api/zbbf;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/google/android/gms/internal/auth-api/zbam;

    .line 11
    .line 12
    iget-object p3, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p2, v0, p1, p3}, Lcom/google/android/gms/internal/auth-api/zbam;->zbd(Lcom/google/android/gms/internal/auth-api/zbaf;Lw4/h;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final synthetic zbb(Lcom/google/android/gms/internal/auth-api/zbbh;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbbd;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/auth-api/zbbd;-><init>(Lcom/google/android/gms/internal/auth-api/zbbg;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbam;

    .line 11
    .line 12
    iget-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbbg;->zbd:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/auth-api/zbam;->zbf(Lcom/google/android/gms/common/api/internal/j;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

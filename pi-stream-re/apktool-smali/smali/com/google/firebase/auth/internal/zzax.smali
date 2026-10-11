.class public final Lcom/google/firebase/auth/internal/zzax;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/firebase/auth/internal/zzax;


# instance fields
.field private zzb:Z

.field private zzc:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    .line 6
    .line 7
    return-void
.end method

.method private static zza(Landroid/content/Intent;)Lcom/google/firebase/auth/AuthCredential;
    .locals 2

    .line 1
    invoke-static {p0}, Lw7/b;->s(Ljava/lang/Object;)V

    const-string v0, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 3
    invoke-static {p0, v0, v1}, Lp7/a0;->p(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lc5/b;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/firebase/auth/zzd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzags;)Lcom/google/firebase/auth/zzd;

    move-result-object p0

    return-object p0
.end method

.method public static zza()Lcom/google/firebase/auth/internal/zzax;
    .locals 1

    .line 6
    sget-object v0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Lcom/google/firebase/auth/internal/zzax;

    invoke-direct {v0}, Lcom/google/firebase/auth/internal/zzax;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    .line 8
    :cond_0
    sget-object v0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    return-object v0
.end method

.method private final zza(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V
    .locals 7

    .line 44
    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzax;->zzc:Landroid/content/BroadcastReceiver;

    .line 45
    invoke-static {p1}, Lb1/b;->a(Landroid/content/Context;)Lb1/b;

    move-result-object p1

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 46
    iget-object v1, p1, Lb1/b;->b:Ljava/util/HashMap;

    .line 47
    monitor-enter v1

    .line 48
    :try_start_0
    new-instance v2, Lb1/a;

    invoke-direct {v2, p2, v0}, Lb1/a;-><init>(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 49
    iget-object v3, p1, Lb1/b;->b:Ljava/util/HashMap;

    invoke-virtual {v3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-nez v3, :cond_0

    .line 50
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    iget-object v5, p1, Lb1/b;->b:Ljava/util/HashMap;

    invoke-virtual {v5, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_0
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p2, 0x0

    .line 53
    :goto_0
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v3

    if-ge p2, v3, :cond_2

    .line 54
    invoke-virtual {v0, p2}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v3

    .line 55
    iget-object v5, p1, Lb1/b;->c:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-nez v5, :cond_1

    .line 56
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    iget-object v6, p1, Lb1/b;->c:Ljava/util/HashMap;

    invoke-virtual {v6, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    :cond_1
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 59
    :cond_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static zza(Landroid/content/Context;)V
    .locals 13

    .line 22
    sget-object v0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    .line 23
    iget-object v0, v0, Lcom/google/firebase/auth/internal/zzax;->zzc:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_6

    .line 24
    invoke-static {p0}, Lb1/b;->a(Landroid/content/Context;)Lb1/b;

    move-result-object p0

    sget-object v0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    iget-object v0, v0, Lcom/google/firebase/auth/internal/zzax;->zzc:Landroid/content/BroadcastReceiver;

    .line 25
    iget-object v2, p0, Lb1/b;->b:Ljava/util/HashMap;

    .line 26
    monitor-enter v2

    .line 27
    :try_start_0
    iget-object v3, p0, Lb1/b;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-nez v3, :cond_0

    .line 28
    monitor-exit v2

    goto :goto_3

    .line 29
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    :goto_0
    if-ltz v4, :cond_5

    .line 30
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb1/a;

    .line 31
    iput-boolean v5, v6, Lb1/a;->d:Z

    move v7, v1

    .line 32
    :goto_1
    iget-object v8, v6, Lb1/a;->a:Landroid/content/IntentFilter;

    invoke-virtual {v8}, Landroid/content/IntentFilter;->countActions()I

    move-result v8

    if-ge v7, v8, :cond_4

    .line 33
    iget-object v8, v6, Lb1/a;->a:Landroid/content/IntentFilter;

    invoke-virtual {v8, v7}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v8

    .line 34
    iget-object v9, p0, Lb1/b;->c:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    if-eqz v9, :cond_3

    .line 35
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v5

    :goto_2
    if-ltz v10, :cond_2

    .line 36
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb1/a;

    .line 37
    iget-object v12, v11, Lb1/a;->b:Landroid/content/BroadcastReceiver;

    if-ne v12, v0, :cond_1

    .line 38
    iput-boolean v5, v11, Lb1/a;->d:Z

    .line 39
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v10, v10, -0x1

    goto :goto_2

    .line 40
    :cond_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-gtz v9, :cond_3

    .line 41
    iget-object v9, p0, Lb1/b;->c:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 42
    :cond_5
    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception p0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 43
    :cond_6
    :goto_3
    sget-object p0, Lcom/google/firebase/auth/internal/zzax;->zza:Lcom/google/firebase/auth/internal/zzax;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzax;->zzc:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic zza(Lcom/google/firebase/auth/internal/zzax;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    const-string p0, "com.google.firebase.auth.internal.RECAPTCHA_TOKEN"

    .line 14
    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 16
    invoke-static {p3}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/firebase/auth/internal/zzax;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/content/Intent;)Lcom/google/firebase/auth/AuthCredential;

    move-result-object p1

    .line 18
    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseAuth;->signInWithCredential(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 19
    new-instance p3, Lcom/google/firebase/auth/internal/zzaz;

    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzaz;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 20
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lcom/google/firebase/auth/internal/zzaw;

    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzaw;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 21
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic zza(Lcom/google/firebase/auth/internal/zzax;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseUser;Landroid/content/Context;)V
    .locals 0

    .line 9
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/content/Intent;)Lcom/google/firebase/auth/AuthCredential;

    move-result-object p1

    .line 10
    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseUser;->linkWithCredential(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 11
    new-instance p3, Lcom/google/firebase/auth/internal/zzbb;

    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzbb;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 12
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lcom/google/firebase/auth/internal/zzay;

    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzay;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 13
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic zzb(Lcom/google/firebase/auth/internal/zzax;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseUser;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/content/Intent;)Lcom/google/firebase/auth/AuthCredential;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseUser;->reauthenticateAndRetrieveData(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p3, Lcom/google/firebase/auth/internal/zzbd;

    .line 10
    .line 11
    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzbd;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p3, Lcom/google/firebase/auth/internal/zzba;

    .line 19
    .line 20
    invoke-direct {p3, p0, p2, p4}, Lcom/google/firebase/auth/internal/zzba;-><init>(Lcom/google/firebase/auth/internal/zzax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final zza(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 64
    iget-boolean v0, p0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/google/firebase/auth/internal/zzbe;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/firebase/auth/internal/zzbe;-><init>(Lcom/google/firebase/auth/internal/zzax;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    .line 66
    iput-boolean p1, p0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zza(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseUser;)Z

    move-result p1

    return p1
.end method

.method public final zza(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseUser;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            ")Z"
        }
    .end annotation

    .line 61
    iget-boolean v0, p0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lcom/google/firebase/auth/internal/zzbc;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/firebase/auth/internal/zzbc;-><init>(Lcom/google/firebase/auth/internal/zzax;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseUser;)V

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/auth/internal/zzax;->zza(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Lcom/google/firebase/auth/internal/zzax;->zzb:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

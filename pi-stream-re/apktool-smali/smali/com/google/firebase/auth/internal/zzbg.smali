.class public final synthetic Lcom/google/firebase/auth/internal/zzbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field private synthetic zza:Lcom/google/firebase/auth/internal/GenericIdpActivity;

.field private synthetic zzb:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/auth/internal/GenericIdpActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzbg;->zza:Lcom/google/firebase/auth/internal/GenericIdpActivity;

    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzbg;->zzb:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbg;->zza:Lcom/google/firebase/auth/internal/GenericIdpActivity;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzbg;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Landroid/content/Intent;

    .line 6
    .line 7
    const-string v3, "android.intent.action.VIEW"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-virtual {v4, v2, v5}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v5

    .line 27
    :goto_0
    const-string v6, "GenericIdpActivity"

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v7, Landroid/content/Intent;

    .line 36
    .line 37
    const-string v8, "android.support.customtabs.action.CustomTabsService"

    .line 38
    .line 39
    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v7, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    move v5, v4

    .line 55
    :cond_1
    if-eqz v5, :cond_2

    .line 56
    .line 57
    new-instance v1, Lm/a;

    .line 58
    .line 59
    invoke-direct {v1}, Lm/a;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lm/a;->a()Landroidx/appcompat/widget/a0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "Opening IDP Sign In link in a custom chrome tab."

    .line 67
    .line 68
    invoke-static {v6, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/net/Uri;

    .line 76
    .line 77
    iget-object v2, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Landroid/content/Intent;

    .line 80
    .line 81
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    iget-object p1, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Landroid/content/Intent;

    .line 87
    .line 88
    iget-object v1, v1, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-static {v0, p1, v1}, Lx/j;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    new-instance v2, Landroid/content/Intent;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Landroid/net/Uri;

    .line 103
    .line 104
    invoke-direct {v2, v3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 105
    .line 106
    .line 107
    const-string p1, "com.android.browser.application_id"

    .line 108
    .line 109
    invoke-virtual {v2, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    const-string p1, "Opening IDP Sign In link in a browser window."

    .line 113
    .line 114
    invoke-static {v6, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    const/high16 p1, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 120
    .line 121
    .line 122
    const/high16 p1, 0x10000000

    .line 123
    .line 124
    invoke-virtual {v2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    const-string p1, "Device cannot resolve intent for: android.intent.action.VIEW"

    .line 132
    .line 133
    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacl;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzaci;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

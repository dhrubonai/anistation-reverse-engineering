.class public final Lcom/google/android/gms/internal/auth-api/zbn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zba(Landroid/content/Context;Lt4/a;Lcom/google/android/gms/auth/api/credentials/HintRequest;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbj;->zba()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p3}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    new-instance p1, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v0, "com.google.android.gms.auth.api.credentials.PICKER"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "com.google.android.gms"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "claimedCallingPackage"

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "logSessionId"

    .line 40
    .line 41
    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, p3, v0}, Lcom/google/android/gms/auth/api/credentials/HintRequest;->writeToParcel(Landroid/os/Parcel;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Landroid/os/Parcel;->marshall()[B

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p3}, Landroid/os/Parcel;->recycle()V

    .line 58
    .line 59
    .line 60
    const-string p3, "com.google.android.gms.credentials.HintRequest"

    .line 61
    .line 62
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    sget p2, Lcom/google/android/gms/internal/auth-api/zbbk;->zba:I

    .line 66
    .line 67
    const/high16 p3, 0x8000000

    .line 68
    .line 69
    or-int/2addr p2, p3

    .line 70
    const/16 p3, 0x7d0

    .line 71
    .line 72
    invoke-static {p0, p3, p1, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 78
    .line 79
    const-string p1, "request must not be null"

    .line 80
    .line 81
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 86
    .line 87
    const-string p1, "context must not be null"

    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
.end method

.class public Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;
.super Lcom/google/android/gms/fido/u2f/api/common/RequestParams;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/Double;

.field public final c:Landroid/net/Uri;

.field public final d:[B

.field public final e:Ljava/util/List;

.field public final f:Lp5/c;

.field public final x:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp5/i;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lp5/i;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;[BLjava/util/ArrayList;Lp5/c;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/fido/u2f/api/common/RequestParams;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->b:Ljava/lang/Double;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->c:Landroid/net/Uri;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->d:[B

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p5, :cond_0

    .line 15
    .line 16
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    if-nez p4, :cond_0

    .line 21
    .line 22
    move p4, p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p4, p1

    .line 25
    :goto_0
    const-string v0, "registeredKeys must not be null or empty"

    .line 26
    .line 27
    invoke-static {v0, p4}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iput-object p5, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->e:Ljava/util/List;

    .line 31
    .line 32
    iput-object p6, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->f:Lp5/c;

    .line 33
    .line 34
    new-instance p4, Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    invoke-virtual {p4, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    :cond_2
    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p6

    .line 52
    if-eqz p6, :cond_5

    .line 53
    .line 54
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p6

    .line 58
    check-cast p6, Lp5/h;

    .line 59
    .line 60
    iget-object v0, p6, Lp5/h;->b:Ljava/lang/String;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v0, p1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move v0, p2

    .line 70
    :goto_3
    const-string v1, "registered key has null appId and no request appId is provided"

    .line 71
    .line 72
    invoke-static {v1, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    iget-object p6, p6, Lp5/h;->b:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz p6, :cond_2

    .line 78
    .line 79
    invoke-static {p6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object p6

    .line 83
    invoke-virtual {p4, p6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    if-eqz p7, :cond_6

    .line 88
    .line 89
    invoke-virtual {p7}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    const/16 p4, 0x50

    .line 94
    .line 95
    if-gt p3, p4, :cond_7

    .line 96
    .line 97
    :cond_6
    move p1, p2

    .line 98
    :cond_7
    const-string p2, "Display Hint cannot be longer than 80 characters"

    .line 99
    .line 100
    invoke-static {p2, p1}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    iput-object p7, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->x:Ljava/lang/String;

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->a:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->b:Ljava/lang/Double;

    .line 24
    .line 25
    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->b:Ljava/lang/Double;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->c:Landroid/net/Uri;

    .line 34
    .line 35
    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->c:Landroid/net/Uri;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->d:[B

    .line 44
    .line 45
    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->d:[B

    .line 46
    .line 47
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-interface {v3, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->f:Lp5/c;

    .line 70
    .line 71
    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->f:Lp5/c;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->x:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->x:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, p1}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    return v0

    .line 90
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->a:Ljava/lang/Integer;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->c:Landroid/net/Uri;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->b:Ljava/lang/Double;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->e:Ljava/util/List;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->f:Lp5/c;

    .line 26
    .line 27
    aput-object v2, v0, v1

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->x:Ljava/lang/String;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->d:[B

    .line 35
    .line 36
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x6

    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lp7/a0;->j0(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->b:Ljava/lang/Double;

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Lp7/a0;->g0(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->c:Landroid/net/Uri;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->d:[B

    .line 28
    .line 29
    invoke-static {p1, v1, v2, v3}, Lp7/a0;->f0(Landroid/os/Parcel;I[BZ)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->e:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {p1, v1, v2, v3}, Lp7/a0;->s0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    iget-object v2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->f:Lp5/c;

    .line 40
    .line 41
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 42
    .line 43
    .line 44
    const/16 p2, 0x8

    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->x:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, p2, v1, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

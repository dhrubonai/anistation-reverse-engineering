.class public final Lcom/google/android/material/datepicker/y;
.super Lm3/d0;
.source "SourceFile"


# instance fields
.field public final d:Lcom/google/android/material/datepicker/k;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm3/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/y;->d:Lcom/google/android/material/datepicker/k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/y;->d:Lcom/google/android/material/datepicker/k;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 4
    .line 5
    iget v0, v0, Lcom/google/android/material/datepicker/c;->f:I

    .line 6
    .line 7
    return v0
.end method

.method public final c(Lm3/a1;I)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/material/datepicker/x;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/datepicker/y;->d:Lcom/google/android/material/datepicker/k;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 8
    .line 9
    iget v1, v1, Lcom/google/android/material/datepicker/p;->c:I

    .line 10
    .line 11
    add-int/2addr v1, p2

    .line 12
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v2, 0x1

    .line 17
    new-array v3, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    aput-object v4, v3, v5

    .line 25
    .line 26
    const-string v4, "%d"

    .line 27
    .line 28
    invoke-static {p2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object p1, p1, Lcom/google/android/material/datepicker/x;->u:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {}, Lcom/google/android/material/datepicker/w;->c()Ljava/util/Calendar;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, v2}, Ljava/util/Calendar;->get(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-ne v3, v1, :cond_0

    .line 50
    .line 51
    const v3, 0x7f1200c6

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-array v3, v2, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    aput-object v4, v3, v5

    .line 65
    .line 66
    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const v3, 0x7f1200c7

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-array v3, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    aput-object v4, v3, v5

    .line 85
    .line 86
    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, v0, Lcom/google/android/material/datepicker/k;->r0:Landroid/support/v4/media/d;

    .line 94
    .line 95
    invoke-static {}, Lcom/google/android/material/datepicker/w;->c()Ljava/util/Calendar;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-ne p2, v1, :cond_1

    .line 104
    .line 105
    iget-object p1, p1, Landroid/support/v4/media/d;->f:Ljava/lang/Object;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    iget-object p1, p1, Landroid/support/v4/media/d;->d:Ljava/lang/Object;

    .line 109
    .line 110
    :goto_1
    const/4 p1, 0x0

    .line 111
    throw p1
.end method

.method public final d(Landroidx/recyclerview/widget/RecyclerView;)Lm3/a1;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0d005b

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/widget/TextView;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/material/datepicker/x;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lcom/google/android/material/datepicker/x;-><init>(Landroid/widget/TextView;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

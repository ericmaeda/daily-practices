from django.shortcuts import render

# Create your views here.

def show_main(request):
    context = {
        'name': 'ericmaeda',
        'class': 'PBP F'
    }

    return render(request, "main.html", context)
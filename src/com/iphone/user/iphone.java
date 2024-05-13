package com.iphone.user;

import com.iphone.app.music.music;
import com.iphone.app.web.web;
import com.iphone.app.phone.phone;

public class iphone implements music, web, phone{
    public void main (String args[]) {
    // Loop com seleção dos métodos dos apps aqui

    }

    @Override
    public void play() {
        // Implementação aqui
    }

    @Override
    public void pause() {
        // Implementação aqui
    }

    @Override
    public void selectSong(String song) {
        // Implementação aqui
    }

    @Override
    public void call(String number) {
        // Implementação aqui
    }

    @Override
    public void addContact(String number, String name) {
        // Implementação aqui
    }

    @Override
    public void acceptCall(String number) {
        // Implementação aqui
    }

    @Override
    public void showPage(String url) {
        // Implementação aqui
    }

    @Override
    public void refreshPage(String currUrl) {
        // Implementação aqui
    }
}

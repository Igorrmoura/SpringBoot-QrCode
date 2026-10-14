package com.Igor.qrcode.generator.controller;

import com.Igor.qrcode.generator.dto.QrCodeGenerateRequestDto;
import com.Igor.qrcode.generator.dto.QrCodeGenerateResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponseDto> genetareQrCode(@RequestBody QrCodeGenerateRequestDto requestDto) {

        return null;
    }
}
